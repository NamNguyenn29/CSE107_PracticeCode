package assignment.lab5;

import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long[] levels = new long[] { 0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE };

        Double[] rates = new Double[] { 1.0, 0.97, 0.95, 0.93, 0.9, 0.88, 0.85 };

        double total = 0;
        for (int i = 0; i < levels.length; i++) {
            if (money <= levels[i]) {
                break;
            }
            total += (Math.min(money, levels[i + 1]) - levels[i]) * rates[i];
        }
        for (int i = 0; i <= 2; i++) {
            if (sc.nextInt() == 1) {
                total *= 0.98;
                total = Math.round(total * 100) / 100;
            }
        }
        System.out.println(Math.round(total));
    }

}
