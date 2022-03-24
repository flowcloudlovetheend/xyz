package com.example.xyz.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/*
Udp 聊天
 */
public class UDPchat1 {


    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(8888);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = bufferedReader.readLine();
            byte[] datas = data.getBytes();

            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 7777));
            socket.send(packet);
            if (data.equals("bye")) {
                break;
            }
        }


        socket.close();

    }

}
