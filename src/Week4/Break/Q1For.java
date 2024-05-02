package Week4.Break;

public class Q1For {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            if(i == 3) {
                System.out.println("프로그램 종료");
                break;
            }
        }

    }
}
