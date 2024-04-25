package Week3.Scanner;

import java.util.Scanner;

// 기본 형태
public class Basic {
    public static void main(String[] args) {

        // 스캐너 객체 가지고 오기
        Scanner scanner = new Scanner(System.in);

        // 이름 받기
        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        // 나이 받기
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();

        System.out.println(name + " " +  age);

        scanner.close();
    }
}
