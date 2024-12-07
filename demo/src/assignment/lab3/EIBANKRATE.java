package assignment.lab3;

import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double amountOfMoney = sc.nextDouble();
        int numOfMonth = sc.nextInt();
        double ratePerMonth = 0.09 / 12;
        double total = amountOfMoney * (1 + ratePerMonth * numOfMonth);
        sc.close();
        System.out.println(total);
    }

}
