package Week6;

class methodTest2 {

    public int sum(int a, int b) {

        int result = 0;

        for(int i = a; i <= b; i++) { // a부터 b까지의 합을 구하는 반복문
            result += i;
        }
        return result;
    }
}

public class method4 {
    public static void main(String[] args) {

        methodTest2 sum = new methodTest2(); // 객체 선언

        int result = sum.sum(5, 23); // 함수 사용

        System.out.println(sum.sum(1, 10));
        System.out.println(result);
    }
}
