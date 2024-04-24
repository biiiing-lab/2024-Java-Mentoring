package Week2;

public class TypeCasting {
    public static void main(String[] args) {

        /* todo 자동형변환 */
        // JVM에 의해 자동으로 변환
        // 작은 메모리 -> 큰 메모리
        int num1 = 10;
        long num2 = num1;
        double num3 = num1;

        System.out.println("int값 : " + num1);
        System.out.println("형변환 된 long값 : " + num2);
        System.out.println("형변환 된 double값 : " + num3);

        /* todo 강제 형변환 */
        // 큰 메모리 -> 작은 메모리
        double num4 = 3.14;
        int num5 = (int) num4;

        System.out.println("double값 : " + num4);
        System.out.println("형변환 된 int값 : " + num5);
    }
}


/* public class TypeCasting {

    public static void main(String[] args) {

    }
    int num1 = 10;
    long num2 = num1;
    double num3 = num1;
    double num3 = num2;

    System.out.println("int값 : " + num1);
    System.out.println("형변환 된 long값 : " + num2);
    System.out.println("형변환 된 double값 : " + num3);

    double num4 = 3.14;
    int num5 = (int) num4;

    System.out.println("double값 : " + num4);
    System.out.println("형변환 된 int값 : " + num5);
}
*/