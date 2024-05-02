package Week4.For;

public class NestingExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) { // 행
            for(int j = 1; j <= 10; j++) { // 열
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
