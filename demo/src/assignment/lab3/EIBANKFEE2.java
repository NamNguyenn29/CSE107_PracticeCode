package assignment.lab3;

import java.util.Scanner;

class EIBANKFEE2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfAccount = sc.nextInt();
        long totalSecs = 0;
        double totalMoney = 0;
        for (int i = 0; i < numOfAccount; i++) {
            double amountOfMoney = sc.nextDouble();
            int numOfSec = sc.nextInt();
            totalSecs += numOfSec;
            double[] levelMoneys = new double[] { 5000, 2000, 500, 0 };
            double[] monthlyFee = new double[] { 0, 5.00, 7.5, 12.00 };
            double[] checks = new double[] { 0, 0.10, 0.20, 0.20 };
            for (int j = 0; j < levelMoneys.length; j++) {
                if (amountOfMoney >= levelMoneys[j]) {
                    totalMoney += monthlyFee[j] + checks[j] * numOfSec;
                    break;
                }
            }

        }
        System.out.println(totalMoney / (double) totalSecs);
        sc.close();
    }

}
