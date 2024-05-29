package Week7.Inheritance;

// 상위 클래스 정의
public class Vehicle {

    String model;
    String color;
    int wheels;

    void moveForward() {
        System.out.println("전진");
    }

    void moveBackward() {
        System.out.println("후진");
    }

}
