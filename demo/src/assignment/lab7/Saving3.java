package assignment.lab7;

import java.util.Scanner;

public class Saving3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Long money = sc.nextLong();
        int month = sc.nextInt();
        double left = 0, right = money;
        while (right - left > 0.001) {
            double middle = (right+left)/2;
            double totalInterest = calculateTotalInterest(middle, month);
            if(totalInterest > money) {
                right = middle;
            } else {
                left = middle;
            }
        }
        double total = Math.round(right*10000);
        System.out.println(total/10000);

    }
    public static double calculateMonthlyInterst(double money, int month) {
        double[] rates = { 3.90, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        int countYear = month/12;
        int countMonth = month%12;
        if(countYear > 0) {
            money = money*(Math.pow((rates[11]/100D)+1, countYear));
        }
        if(countMonth > 0) {
            money = money*(1+(rates[countMonth-1]/1200D)*countMonth);
        }
        return money;
    } 
    public static double calculateTotalInterest(double money, int month) {
        double total = 0;
        while (month > 0) {
            total += calculateMonthlyInterst(money, month);
            month--;
        }
        return total;
    }
}
