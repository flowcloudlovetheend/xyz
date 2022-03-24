package com.example.xyz.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) {

        Socket socket = null;
        OutputStream out = null;
        try {

            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            socket = new Socket(address, port);

            out = socket.getOutputStream();
            out.write("你好啊啊啊".getBytes());
        } catch (Exception e) {

        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
