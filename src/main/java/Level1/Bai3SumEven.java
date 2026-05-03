package Level1;

public class Bai3SumEven {

    public static void main(String[] args) {
        System.out.println(sumEven(10)); // 30
        System.out.println(sumEven(5));  // 6
    }

    public static int sumEven(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}