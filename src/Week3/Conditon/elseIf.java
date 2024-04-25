package Week3.Conditon;

public class elseIf {
    public static void main(String[] args) {

        int example = 15;

        if(example < 10) { // 첫번째 조건
            System.out.println("10보다 작음");
        } else if (example > 10) { // 두번째 조건
            System.out.println("10보다 큼");
        } else {
            System.out.println("예외");
        }
    }
}
