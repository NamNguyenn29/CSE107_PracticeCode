package assignment.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tCase = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < tCase; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] numbers = new int[m];
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                if (num >= 1 && num <= n) {
                    numbers[j] = num;
                }
            }
            Arrays.sort(numbers);
            boolean contain1 = false;
            boolean containN = false;
            boolean isSequence = true;
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] == 1) {
                    contain1 = true;
                }
                if (numbers[k] == n) {
                    containN = true;
                    break;
                }
                if (k >= 1) {
                    if (contain1 && numbers[k] > numbers[k - 1] + 1) {
                        isSequence = false;
                        break;
                    }
                }
            }
            ans.append((contain1 && containN && isSequence) ? "Yes" : "No").append("\n");
        }
        System.out.println(ans);
        sc.close();
    }
}
