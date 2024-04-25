package Week3.Conditon;

public class NestingIf {
    public static void main(String[] args) {
        int example = 17;

        // 20보다 작은 경우
        if(example < 20) {

            // 20보다 작은 동시에 15보다 클 경우
            if(example > 15) {
                System.out.println(example + "은 20보다는 작고 15보다는 큼");
            } else { // 아닌 경우
                System.out.println(example + "은 20보다는 작고 15보다는 작음");
            }
        } else { // 아닌 경우
            System.out.println("20보다 큼");
        }
    }
}
