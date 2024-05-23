package Week6;


class method {
    public void methodNew() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class method2 {
    public static void main(String[] args) {

        method forPractice = new method(); // 객체 생성

        forPractice.methodNew();
    }
}

