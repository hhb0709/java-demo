package cn.hhb.socket.day01;

import java.io.IOException;
import java.io.InputStream;

public class Request {
    private InputStream inputStream;
    private String uri;

    public Request(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getUri() {
        return uri;
    }

    public void parse() {
        StringBuffer request = new StringBuffer(2048);
        //缓冲区
        byte[] buffer = new byte[2048];
        int i = 0;
        try {
            i = inputStream.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            i = -1;
        }

        for (int j = 0; j < i; j++) {
            request.append((char) buffer[j]);
        }
        uri = parseUri(request.toString());
    }

    public String parseUri(String requestString) {
        int index1, index2;
        index1 = requestString.indexOf(' ');
        if (index1 != -1) {
            index2 = requestString.indexOf(' ', index1 + 1);
            if (index2 > index1) {
                return requestString.substring(index1 + 1, index2);
            }

        }
        return null;
    }

}
