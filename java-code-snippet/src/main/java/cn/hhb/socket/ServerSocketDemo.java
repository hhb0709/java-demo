package cn.hhb.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080,1, InetAddress.getByName("127.0.0.1"));
    }
}
