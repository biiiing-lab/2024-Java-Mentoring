package Week6;

import java.util.Scanner;

class test1Method {

    int result = 0;

    public int testNumber1(int n, int m) {
        for(int i = n; i <= m; i++) {
            result += n;
        }

        return result;
    }
}

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        test1Method test = new test1Method();

        System.out.println(test.testNumber1(n, m));
    }
}
