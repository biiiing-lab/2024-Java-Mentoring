package Week2;

public class BasicVariable {

    // 메인 함수가 있어야지 실행이 가능함
    public static void main(String[] args) {

        /* todo 기본 자료형 변수 */
        boolean booleanValue = true; // 참, 거짓 (true, false)
        char charValue = 'A';

        // byte < short < int < long 정수
        // float < double 실수
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 30.333F;
        double doubleValue = 99.999;


        // byte 크기
        System.out.println("charValue : " + charValue);
        System.out.println(Character.SIZE);

        System.out.println("byteValue : " + byteValue);
        System.out.println(Byte.SIZE);

        System.out.println("shortValue : " + shortValue);
        System.out.println(Short.SIZE);

        System.out.println("intValue : " + intValue);
        System.out.println(Integer.SIZE);

        System.out.println("longValue : " + longValue);
        System.out.println(Long.SIZE);

        System.out.println("floatValue : " + floatValue);
        System.out.println(Float.SIZE);

        System.out.println("doubleValue : " + doubleValue);
        System.out.println(Double.SIZE);


    }
}
