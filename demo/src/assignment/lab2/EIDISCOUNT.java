package assignment.lab2;

import java.util.Scanner;

public class EIDISCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        double levels[] = { 0, 2000000, 10000000, 50000000, 100000000, 200000000, 500000000, Long.MAX_VALUE / 2 };
        double[] rates = { 0, 3, 5, 7, 10, 12, 15 };
        double total = 0;
        for (int i = 0; i < levels.length; i++) {
            if (money < levels[i]) {
                break;
            }
            total += (Math.min(levels[i + 1], money) - levels[i]) * (1 - rates[i] / 100);
        }
        System.out.println(Math.round(total));
    }

}
