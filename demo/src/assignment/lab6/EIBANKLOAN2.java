package assignment.lab6;

import java.util.Scanner;

class EIUBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double monthlyPayment = sc.nextDouble();
        double rate = sc.nextDouble();
        rate /= 1200;
        long month = (long) Math.ceil(Math.log(monthlyPayment / (monthlyPayment - price * rate)) / Math.log(1 + rate));
        System.out.println(month);

    }

}
