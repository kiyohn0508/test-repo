// Basic Java structure for coding
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // Your code starts here
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;


        while (true) { 
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요");
            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {
                if (productCount < 10){
                    System.out.print("상품 이름을 입력하세요");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();
                    
                    productCount++;
                } else {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
            } else if (command == 2){
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++){
                    String result = productNames[i] + ":" + productPrices[i] + "원";
                    System.out.println(result);
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
        }
    }
}