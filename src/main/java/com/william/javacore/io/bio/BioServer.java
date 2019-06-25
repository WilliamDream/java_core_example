package com.william.javacore.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2018/6/24 21:32
 */
public class BioServer {

    private ServerSocket server;

    public BioServer(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("服务端已启动，监听端口："+port);

        }catch (Exception e){

        }
    }

    public void listen() throws IOException{
        while (true){
            Socket socket = server.accept();
            System.out.println(socket.getPort());
            InputStream inputStream = socket.getInputStream();
            byte[] buff = new byte[1024];
            int len = inputStream.read(buff);
            if(len > 0){
                String msg = new String(buff,0,len);
                System.out.println("消息内容："+msg);
            }


        }

    }

    public static void main(String[] args)throws IOException {
      new BioServer(8080).listen();
    }

}
