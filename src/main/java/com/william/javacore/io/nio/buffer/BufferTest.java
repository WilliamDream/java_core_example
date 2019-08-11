package com.william.javacore.io.nio.buffer;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/27 21:47
 */
public class BufferTest {


    public static void main(String[] args) throws Exception{

        FileInputStream in = new FileInputStream("D://filetext.txt");
        FileChannel channel =  in.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(80);
        print("init",buffer);

        channel.read(buffer);
        print("read",buffer);

        buffer.flip();
        print("flip",buffer);

        //判断有没有数据可读
        while (buffer.remaining()>0){
            byte b = buffer.get();

        }
        print("get",buffer);

        buffer.clear();
        print("clear",buffer);

        in.close();


    }

    private static void print(String op ,ByteBuffer buffer){
        System.out.print(op+":");
        System.out.print("capacity: " + buffer.capacity() + ", ");
        System.out.print("position: " + buffer.position() + ", ");
        System.out.println("limit: " + buffer.limit());
        System.out.println();
    }


}
