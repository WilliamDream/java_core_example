package com.william.javacore.io.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2018/6/24 21:35
 */
public class BioClient {

    public static void main(String[] args)throws IOException {
        Socket socket = new Socket("localhost",8080);
        OutputStream outputStream = socket.getOutputStream();
        long l = new Date().getTime();
        System.out.println("客户端发送数据：" + l);
        outputStream.write(String.valueOf(l).getBytes());
        outputStream.close();
        socket.close();

    }


}
