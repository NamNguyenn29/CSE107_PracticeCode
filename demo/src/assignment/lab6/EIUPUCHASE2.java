package assignment.lab6;

import java.util.Scanner;

public class EIUPUCHASE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double t = sc.nextDouble();
        double budget = sc.nextDouble();
        double monthlyPayment = sc.nextDouble();
        double loan = v - budget;
        double left = 0, right = 1;
        while (right - left > 0.00000000001) {
            double middle = (left + right) / 2;
            double R = middle + 1;
            double f = Math.pow(R, t) * loan - ((monthlyPayment * (Math.pow(R, t) - 1)) / (R - 1));
            if (f < 0) {
                left = middle;
            } else {
                right = middle;
            }
        }
        System.out.printf("%.7f", right);

    }

}
