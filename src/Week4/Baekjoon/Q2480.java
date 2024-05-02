package Week4.Baekjoon;

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 모두 같은 경우
        if(a == b && b == c && c == a) {

            System.out.println(10000 + a * 1000);

            // 두개만 같은 경우
        } else if (a == b || b == c || c == a) {

            if(a == b) {
                System.out.println(1000 + a * 100);
            } else if(b == c) {
                System.out.println(1000 + b * 100);
            } else if(c == a) {
                System.out.println(1000 + c * 100);
            }

            // 다 다른 경우
        } else {
            if(a > b) {

                if(a > c) {
                    System.out.println(a * 100);
                } else if(a < c) {
                    System.out.println(c * 100);
                }

            } else if (b > c) {

                if(b > a) {
                    System.out.println(b * 100);
                } else if(b < a) {
                    System.out.println(a * 100);
                }

            } else if (c > a) {
                if(c > b) {
                    System.out.println(c * 100);
                } else if(c < b) {
                    System.out.println(b * 100);
                }
            }
        }
    }
}
