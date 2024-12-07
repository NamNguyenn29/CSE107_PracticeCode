package assignment.lab5;

import java.util.Scanner;

class EIUMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int numOfItem = sc.nextInt();
        long levels[] = { 200000000, 50000000, 20000000, 1000000, 0 };
        double rates[] = { 0.07, 0.05, 0.03, 0.02, 0 };
        double total = 0;
        for (int i = 0; i < numOfItem; i++) {
            long price = sc.nextLong();
            for (int j = 0; j < levels.length; j++) {
                if (total >= levels[j]) {
                    sb.append((double) price * rates[j]).append(" ");
                    break;
                }

            }
            total += price;
        }
        System.out.println(sb);
    }

}
