package Week6;

import java.util.Scanner;

class test2Method {

    int result;

    public void coffie(int money) {
        if(money > 4000) {

            result = money - 4000;
            System.out.println(result + "원 남았습니다.");

        } else if(money < 4000) {

            result = 4000 - money;
            System.out.println(result + "원 부족합니다.");

        } else if (money == 4000){

            System.out.println("결제 완료");

        }
    }
}

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test2Method test = new test2Method();
        test.coffie(3800);
        test.coffie(5000);
        test.coffie(4000);
    }
}
