package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        String data = "append Hello, Java FileOutputStream!";

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fileIO/hello.txt", true);
            fos.write(data.getBytes());
            System.out.println("파일 쓰기 완료!");
        } catch (IOException e){
            System.out.println("파일 쓰기 중 오류 발생");
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();  // 자원 해제
            } catch (IOException e) {
                System.out.println("파일 닫기 오류 발생");
            }
        }
    }
}
