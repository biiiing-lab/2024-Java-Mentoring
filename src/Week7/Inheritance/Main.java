package Week7.Inheritance;

public class Main {
    public static void main(String[] args) {

        // 객체 생성
        Car car = new Car();
        Bike bike = new Bike();

        // Car 객체 재정의
        car.color = "검정색";
        car.model = "아반떼";

        System.out.println("나의 자동차는 " + car.model + "이며, 색상은 " + car.color + "입니다.");

        // car 객체 실행
        car.moveForward();;
        car.openWindow();

        // bike 객체 실행
        bike.moveForward();
        bike.moveBackward();
        bike.stunt();
    }
}
