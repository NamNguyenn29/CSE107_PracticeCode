package assignment.lab3;

import java.util.Scanner;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            double afMoney = sc.nextDouble();
            ans.append(afMoney / 9).append(" ");
        }
        System.out.println(ans);
    }

}
