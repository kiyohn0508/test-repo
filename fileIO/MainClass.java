package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("fileIO/hello.txt");  // 존재하지 않으면 예외 발생
            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다.");
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("파일을 닫는 중 오류 발생");
            }
        }
        
    }
}
