package assignment.lab5;

import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfBill = sc.nextInt();
        int levels[] = { 0, 2000001, 5000001, 10000001, 20000001, 50000001, 100000001, 200000001 };
        double rates[] = { 3, 4, 5, 6, 7, 8, 9, 10 };
        double totalIncome = 0;
        for (int i = 0; i < numOfBill; i++) {
            int payment = sc.nextInt();
            double total = 0;
            for (int j = 0; j < rates.length; j++) {
                if (levels[j] > payment) {
                    break;
                }
                total = (1 - rates[j] / 100) * payment;
            }
            totalIncome += total;
        }
        System.out.println(Math.round(totalIncome));
    }
}
