package Week4.Break;

public class BreakExample {
    public static void main(String[] args) {

        while(true) {
            int num = (int)(Math.random() * 6) + 1; // 1~6의 랜덤 숫자
            System.out.println(num);
            if(num == 6) {
                break; // 6이 나올 경우 반복문 멈추기
            }
        }

        System.out.println("프로그램 종료"); // 종료 문구
    }
}
