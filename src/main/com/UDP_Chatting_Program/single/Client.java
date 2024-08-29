package main.com.UDP_Chatting_Program.single;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// @Description: Client-side single time socket program based on UDP transmission protocol
// @Author：Zexin Lin
// @Date：Aug 29, 2024
public class Client {
    public static void main(String[] args) throws Exception {
        // Create a client socket
        DatagramSocket socket = new DatagramSocket();

        // Create a data packet to send data
        byte[] buf = "Hello from client".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 9999);

        // Send data to server
        socket.send(packet);
        socket.close();

    }
}
