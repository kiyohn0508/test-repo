package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("fileIO/hello.txt");
            FileOutputStream fos = new FileOutputStream("fileIO/hello_copy.txt");
        ) {
            byte[] buffer = new byte[1024]; // 1KB 버퍼
            int length;
            while ((length = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, length);
            }
            System.out.println("파일 복사 완료!");
        } catch (IOException e) {
            System.out.println("복사 중 오류 발생: " + e.getMessage());
        }
    }
}
