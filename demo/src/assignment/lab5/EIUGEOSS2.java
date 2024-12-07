package assignment.lab5;

import java.util.Scanner;

public class EIUGEOSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double netSalary = sc.nextDouble();

        double levels[] = new double[] { 0, 11000000, 16000000, 21000000, 29000000, 43000000, 63000000, 91000000,
                Long.MAX_VALUE };
        double rates[] = { 0, 5, 10, 15, 20, 25, 30, 35 };

        double currentNet = 0, currentGross = 0;
        for (int i = 1; i < levels.length; i++) {
            double x = currentNet + (levels[i] - levels[i - 1]) * (1 - (rates[i - 1] / 100D));
            if (x < netSalary) {
                currentNet = x;
                currentGross = levels[i];
            } else {
                currentGross += (netSalary - currentNet) / (1 - (rates[i - 1] / 100D));
                break;
            }
        }
        System.out.println(Math.round(currentGross));
    }

}
