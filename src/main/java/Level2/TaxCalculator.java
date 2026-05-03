package Level2;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập thu nhập (VND): ");
        double income = sc.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Thuế phải trả: " + tax);

        sc.close();
    }

    public static double calculateTax(double income) {
        if (income <= 5000000) return income * 0.05;
        else if (income <= 10000000) return income * 0.10;
        else if (income <= 18000000) return income * 0.15;
        else if (income <= 32000000) return income * 0.20;
        else if (income <= 52000000) return income * 0.25;
        else if (income <= 80000000) return income * 0.30;
        else return income * 0.35;
    }
}