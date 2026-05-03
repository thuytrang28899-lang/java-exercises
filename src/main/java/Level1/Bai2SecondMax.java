package Level1;

public class Bai2SecondMax {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 0, 2};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {3};

        System.out.println(secondMax(arr1)); // 4
        System.out.println(secondMax(arr2)); // 5
        System.out.println(secondMax(arr3)); // Integer.MIN_VALUE
    }

    public static int secondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num < max && num > second) {
                second = num;
            }
        }

        return second;
    }
}
