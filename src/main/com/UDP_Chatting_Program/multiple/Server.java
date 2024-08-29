package main.com.UDP_Chatting_Program.multiple;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);
        System.out.println("Server starting...on port: "  + socket.getLocalPort());


        while (true) {
            DatagramPacket dp = new DatagramPacket(new byte[1024 * 64], 1024 * 64);
            socket.receive(dp);
            System.out.println("Received message from " + dp.getAddress() + ":" + dp.getPort());
            System.out.println("Msg Info: " + new String(dp.getData(), 0, dp.getLength()));
        }
    }
}
