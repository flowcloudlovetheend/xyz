package com.example.xyz.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
Udp 聊天
 */
public class UDPchat2 {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(7777);

        while (true) {
            byte[] con = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(con, 0, con.length);
            socket.receive(datagramPacket);

            byte[] data = datagramPacket.getData();
            String result = new String(data, 0, data.length);
            System.out.println(result);
            if (result.equals("bye")) {
                break;
            }

        }

        socket.close();


    }

}
