package Week4.Break;

public class Q2While {

    public static void main(String[] args) {
        int i = 1;

        while(true) {

            System.out.println(i);
            if(i == 3) {
                break; // 3이 나올 경우 반복문 멈추기
            }
            i++;
        }
    }
}
