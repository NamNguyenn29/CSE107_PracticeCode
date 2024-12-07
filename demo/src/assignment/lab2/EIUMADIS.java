package assignment.lab2;

import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLong();
        }
        long minDiff = numbers[0];
        long max = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] - minDiff > max) {
                max = numbers[i] - minDiff;
            }
            if (numbers[i] < minDiff) {
                minDiff = numbers[i];
            }
        }
        System.out.println(max);

        sc.close();
    }

}
