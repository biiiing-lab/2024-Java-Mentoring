package Week2.AlgorithimTest;

public class Q4 {
    public static void main(String[] args) {

        // 기존 변수 선언
        int a = 10;
        int b = 20;

        // 10 복사
        int c = a;

        // 20 복사
        a = b;

        // 10 복사
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
