package cn.hhb.socket;

import java.io.*;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("www.baidu.com", 80);
        OutputStream os = socket.getOutputStream();
        boolean autoflush = true;
        PrintWriter out = new PrintWriter(socket.getOutputStream(), autoflush);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("GET / HTTP/1.1");
        out.println("Host: localhost:8080");
        out.println("Connection: Close");
        out.println();

        boolean loop = true;
        StringBuilder sb = new StringBuilder(8096);
        while (loop) {
            if (in.ready()) {
                int i = 0;
                while(i!=-1){
                    i = in.read();
                    sb.append((char)i);
                }
                loop=false;
            }
            Thread.currentThread().sleep(50);
        }
        System.out.println(sb.toString());
        socket.close();
    }
}
