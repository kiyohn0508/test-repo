package socket;

import java.io.*;
import java.net.*;

public class ClientExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9000)) {
            OutputStream output = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            writer.write("Hello, Server!");
            writer.newLine();
            writer.flush();

            System.out.println("메시지 전송 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
