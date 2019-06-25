package com.william.javacore.io.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/25 21:51
 */
public class NioServer {

    private int port;

    private Selector selector;

    private ByteBuffer buffer = ByteBuffer.allocate(1024);

    public NioServer(int port){

        try{
            this.port = port;
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(this.port));
            //默认是阻塞的
            serverSocketChannel.configureBlocking(false);

            selector = Selector.open();

            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);


        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void listen(){

        try {
            //不断的轮询,此处是非阻塞的
            while (true){
                selector.select();
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                //此处是同步的
                while (iterator.hasNext()){
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();
                    process(selectionKey);

                }




            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //每次循环只能处理一个准备好的线程，一次处理一种事件
    private void process(SelectionKey key) throws  Exception{
        if(key.isAcceptable()){
            ServerSocketChannel server = (ServerSocketChannel) key.channel();
            SocketChannel channel = server.accept();
            channel.configureBlocking(false);
            //当数据准备就绪了，将状态设置为可读状态
            key = channel.register(selector,SelectionKey.OP_READ);
        }else if (key.isReadable()){
            SocketChannel socketChannel = (SocketChannel) key.channel();
            int len = socketChannel.read(buffer);
            if(len > 0){
                buffer.flip();
                String str = new String(buffer.array(),0,len);
                socketChannel.register(selector,SelectionKey.OP_WRITE);
                key.attach(str);
                System.out.println("读取到的内容是："+str);
            }
        }else if (key.isWritable()){
            SocketChannel socketChannel = (SocketChannel) key.channel();
            String str = (String) key.attachment();
            socketChannel.write(ByteBuffer.wrap(("输出内容是："+str).getBytes()));
            socketChannel.close();

        }
    }


    public static void main(String[] args) {
        new NioServer(8080).listen();
    }

}
