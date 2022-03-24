package com.example.xyz.socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
tcp 传送文件
 */
public class FileSocket {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();


        FileOutputStream fous = new FileOutputStream(new File("456.png"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            fous.write(buffer, 0, len);
        }


        OutputStream out = socket.getOutputStream();
        out.write("接收完成".getBytes(StandardCharsets.UTF_8));

        in.close();
        out.close();
        socket.close();
        fous.close();
    }

}
