package Week4.DoWhile;

public class Q2 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while(i <= 10);

        System.out.println(sum);
    }
}
