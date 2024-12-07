package assignment.lab3;

import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long salary = sc.nextLong();
        double tax = 0;
        if (salary >= 9000000) {
            salary -= 9000000;
            double[] levels = { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE / 2 };
            double[] rates = { 0.05, 0.1, 0.15, 0.20, 0.25, 0.30, 0.35 };
            for (int i = 0; i < levels.length; i++) {
                if (salary < levels[i])
                    break;
                tax += (Math.min(salary, levels[i + 1]) - levels[i]) * rates[i];
            }
        }
        System.out.println(Math.round(tax));
    }

}
