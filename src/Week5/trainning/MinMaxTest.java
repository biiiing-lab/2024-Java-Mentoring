package Week5.trainning;

import java.util.Scanner;

public class MinMaxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for(int i = 0; i < arraySize; i++) {

            if(array[i] > max) {
                max = array[i];
            } else {
                min = array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
