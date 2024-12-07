package assignment.lab6;

import java.util.Scanner;

public class EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long price = sc.nextLong();
        long prepay = sc.nextLong();
        int numOfMonth = sc.nextInt();
        double rate = sc.nextDouble();
        long loan = price - prepay;
        rate += 1;
        double monthlyPayment = (Math.pow(rate, numOfMonth) * loan) / ((Math.pow(rate, numOfMonth) - 1) / (rate - 1));
        System.out.println((long) monthlyPayment);

    }
}
