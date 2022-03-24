package com.example.xyz.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSocket {

    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket();
        String msg = "123";

        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, InetAddress.getByName("localhost"), 9090);
        socket.send(packet);

        socket.close();

    }

}
