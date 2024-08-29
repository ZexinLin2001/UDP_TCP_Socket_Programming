package main.com.UDP_Chatting_Program.single;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


// @Description: Server-side single time socket program based on UDP transmission protocol
// @Author：Zexin Lin
// @Date：Aug 29, 2024
public class Server {
    public static void main(String[] args) throws Exception {
        // Create a socket and wait for client to connect
        DatagramSocket socket = new DatagramSocket(9999);
        System.out.println("Server starting...on port: "  + socket.getLocalPort());

        // Prep a data packet to receive data
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket dp =  new DatagramPacket(buffer, buffer.length);

        // Get data from client
        socket.receive(dp);

        // print out the message along with the source of the msg
        System.out.println("Received message from " + dp.getAddress() + ":" + dp.getPort());
        System.out.println("Msg Info: " + new String(buffer, 0, dp.getLength()));

    }
}
