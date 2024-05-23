package Week6;

class methodTest {
    public int print(int a, int b) {
       return a + b;
    }
}

public class method3 {
    public static void main(String[] args) {
        methodTest test = new methodTest();

        int a = test.print(5, 10);

        System.out.println(a);
    }
}
