package socket;

import java.io.*;
import java.net.*;

public class ServerExample {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9000)) {
            System.out.println("서버 대기 중...");

            Socket socket = serverSocket.accept(); // 클라이언트 연결 대기
            System.out.println("클라이언트 연결됨!");

            // InputStream input = socket.getInputStream();
            // BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // String message = reader.readLine();
            // System.out.println("받은 메시지: " + message);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
