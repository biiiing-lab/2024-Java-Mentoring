package Week6;

class calcul {
    static int base = 0; // 결과값
    int a, b;

    public void setOperator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.println(this.a + this.b);
        System.out.println(a + b);
    }

    public void avg() {
        System.out.println((this.a + this.b) / 2);
        System.out.println((a + b) / 2);
    }
}

public class Calculator {
    public static void main(String[] args) {
        calcul cal = new calcul();

        System.out.println(cal.a);
        System.out.println(cal.b);

        cal.setOperator(5, 10);
        cal.sum();
        cal.avg();
    }
}
