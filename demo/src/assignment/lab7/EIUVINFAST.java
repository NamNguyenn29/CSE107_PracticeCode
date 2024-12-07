package assignment.lab7;

import java.util.Scanner;

public class EIUVINFAST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long priceOfBattery = sc.nextLong();
        long recallPrice = sc.nextLong();
        int period = sc.nextInt();
        double rate = sc.nextDouble();
        rate /= 100D;

        double total = calculateMonthlyPayment(priceOfBattery, period, rate);
        if (recallPrice > 0) {
            total -= calculateMonthlyPayment(recallPrice, period, rate) - recallPrice * rate;
        }
        System.out.println(Math.round(total));
    }

    public static double calculateMonthlyPayment(long money, int period, double rate) {
        return (money * Math.pow(1 + rate, period) * rate) / (Math.pow(1 + rate, period) - 1);
    }

}
