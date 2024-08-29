package main.com.UDP_Chatting_Program.multiple;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);

        // Multiple msg sending to server
        while(true) {
            System.out.print("Enter Message : ");
            String message = scanner.nextLine();

            if (message.toLowerCase().equals("exit")) {
                System.out.println("Closing Client Socket, Goodbye!");
                socket.close();
                break;
            }

            // create a data packet for this message
            byte[] buffer = message.getBytes();
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 9999);
            socket.send(dp);
        }

    }
}
