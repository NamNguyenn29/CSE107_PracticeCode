package assignment.lab2;

import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int numOfCase = sc.nextInt();
        for (int i = 0; i < numOfCase; i++) {
            long blueNum = sc.nextInt();
            long redNum = sc.nextInt();
            long bluePrize = sc.nextInt();
            long redPrize = sc.nextInt();
            long changePrize = sc.nextInt();
            bluePrize = Math.min(bluePrize, redPrize + changePrize);
            redPrize = Math.min(redPrize, bluePrize + changePrize);
            Long total = blueNum * bluePrize + redPrize * redNum;
            sb.append(total).append("\n");
        }
        System.out.println(sb);
    }
}
