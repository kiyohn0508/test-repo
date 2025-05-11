
import java.util.Scanner;


public class method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        
        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

            System.out.print("선택: ");
            int command = scanner.nextInt();

            if (command == 1){

            } else if (command == 2){
                System.out.print("출금액을 입력하세요: ");
            } else if (command == 3) {
                System.out.println("현재 잔액: " + balance);
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
            

        }
    }
    // 제어자 반환타입 메서드이름(매개변수 목록)
    
}
