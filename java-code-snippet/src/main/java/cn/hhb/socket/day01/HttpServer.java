package cn.hhb.socket.day01;

import java.io.File;
import java.net.InetAddress;
import java.net.ServerSocket;

public class HttpServer {
    public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webroot";

    private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";
    private boolean shutdown = false;

    public void await() {
        ServerSocket socket = null;
        int port = 8080;

        try {
            socket = new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        while (!shutdown){

        }

    }

    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.await();
    }
}
