package cn.hhb.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream inputStream = new FileInputStream("test.txt");
        byte[] buffer = new byte[2048];
        byte b = (byte) inputStream.read(buffer);
    }
}
