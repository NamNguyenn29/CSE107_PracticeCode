package assignment.lab6;

import java.util.Scanner;

public class EIUPURCHASE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double t = sc.nextDouble();
        double budget = sc.nextDouble();
        double monthlyPayment = sc.nextDouble();
        double loan = v - budget;
        double step = 0.00000001;
        for (double r = 0; r < 1; r += step) {
            double R = 1D + r;
            double f = Math.pow(R, t) * loan - ((monthlyPayment * (Math.pow(R, t) - 1)) / (R - 1));
            if (f > 0) {
                r = Math.round(r * 1000);
                System.out.println(r / 1000);
                break;
            }
        }

    }
}