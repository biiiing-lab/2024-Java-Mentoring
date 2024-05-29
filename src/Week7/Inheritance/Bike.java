package Week7.Inheritance;

// 자식 클래스
public class Bike extends Vehicle {

    boolean isRaceable;

    @Override // 기능 재정의
    void moveForward() {
        System.out.println("오토바이 앞으로 전진");
    }

    public void stunt() {
        System.out.println("오토바이로 묘기 부리기");
    }
}
