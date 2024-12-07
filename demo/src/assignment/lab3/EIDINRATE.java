package assignment.lab3;

import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCase = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numOfCase; i++) {
            double amountOfMoney = sc.nextDouble();
            double rate = sc.nextDouble();
            double totalMoney = sc.nextDouble();
            rate /= 100;
            double numOfYear = Math.log(totalMoney / amountOfMoney) / Math.log(1 + rate);
            ans.append((long) Math.ceil(numOfYear)).append("\n");
        }
        System.out.println(ans);
        sc.close();
    }

}
