package assignment.lab5;

import java.util.Scanner;

public class EIUSALES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sale = sc.nextInt();
        double levels[] = { 0, 20, 50, 200, 500, 2000, Long.MAX_VALUE / 2 };
        double rates[] = { 2, 3, 4, 5, 6, 7 };
        double total = 0;
        for (int i = 0; i < levels.length; i++) {
            if (sale < levels[i])
                break;
            total += (Math.min(sale, levels[i + 1]) - levels[i]) * (rates[i] / 100);
        }
        double temp = Math.round(total * 1000);
        System.out.println(temp / 1000);
    }
}
