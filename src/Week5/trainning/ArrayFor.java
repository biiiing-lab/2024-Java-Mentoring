package Week5.trainning;

import java.util.Scanner;

public class ArrayFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] > 35) {
                System.out.println(a[i]);
            }
        }
    }
}
