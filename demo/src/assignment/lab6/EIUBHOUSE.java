package assignment.lab6;

import java.util.Scanner;

public class EIUBHOUSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double budget = sc.nextDouble();
        double period = sc.nextDouble();
        double rate = sc.nextDouble();
        StringBuilder sb = new StringBuilder();
        double loan = price - budget;
        rate /= 100D;
        double monthlyDebt = loan / period;
        double monthlyPayment = 0;
        for (int i = 1; i <= period; i++) {
            monthlyPayment = monthlyDebt + loan * rate;
            sb.append(i).append(" ").append(Math.round(monthlyPayment)).append("\n");
            loan -= monthlyDebt;
        }
        System.out.println(sb);
        sc.close();
    }
}