package Week5.trainning;

public class forEachDimensionalArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};

        for(int[] m : a) {
            for(int n : m) {
                System.out.println(n);
            }
        }
    }
}
