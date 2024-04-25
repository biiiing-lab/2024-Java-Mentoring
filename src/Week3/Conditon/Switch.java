package Week3.Conditon;

public class Switch {
    public static void main(String[] args) {
        int age = 20;

        // 첫 번째 경우
        switch (age) {
            case 19 :
                System.out.println("미성년자");
                break; // 꼭해주기

            case 20 :
                System.out.println("성인");
                break;

            default :
                System.out.println("몇살?");
                break;
        }

        // 자바 14버전 이후 가능한 두 번째 경우
        switch (age) {
            case 17, 18, 19 :
                System.out.println("미성년자");
                break;

            case 20, 21, 22, 23 :
                System.out.println("20대 초반");
                break;

            default :
                System.out.println("몇살?");
                break;
        }
    }
}
