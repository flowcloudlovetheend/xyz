package com.example.xyz.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/*
tcp 传送文件
 */
public class FileClientSocket {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

        OutputStream out = socket.getOutputStream();

//        System.out.println(File.pathSeparatorChar);
        FileInputStream file = new FileInputStream(new File("123.png"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = file.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2 = inputStream.read(buffer2)) != -1) {
            outputStream.write(buffer2, 0, len2);
        }
        System.out.println(outputStream.toString());

        inputStream.close();
        outputStream.close();
        out.close();
        socket.close();

    }

}
