package ICPC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class E {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        // System.out.println("-" + n);
        int[][] infomation = new int[n - 1][2];
        for (int i = 0; i < infomation.length; i++) {
            for (int j = 0; j < 2; j++) {
                infomation[i][j] = sc.nextInt();
                // System.out.println("-" + infomation[i][j]);
            }
        }
        int T = sc.nextInt();
        // System.out.println("- T" + T);
        for (int i = 0; i < T; i++) {
            // if (i == 1){
            // System.out.println("start again");
            // }
            int x = sc.nextInt();
            int y = sc.nextInt();
            // System.out.println("xy" + x + y);
            int temp = y;
            boolean stop = false;
            boolean go = true;
            for (int j = 0; j < infomation.length; j++) {
                // System.out.println("j" + j);
                for (int j2 = 0; j2 < infomation.length; j2++) {
                    // System.out.println("j2" + j2);
                    if (temp == infomation[j2][1]) {
                        temp = infomation[j2][0];
                        // System.out.println("temp" + temp);
                        if (x == temp) {
                            // System.out.println("if 2 ");
                            sb.append("Yes\n");
                            go = false;
                            break;
                        }
                    }
                    // System.out.println("check stop");
                    if (j2 == (infomation.length - 1)) {
                        // System.out.println("stop = true");
                        stop = true;
                    }
                }
                if (go == false) {
                    break;
                }
                if (stop == true) {
                    // System.out.println("NO WAY");
                    sb.append("No\n");
                    // System.out.println("NO WAY two");
                    break;
                }
            }

        }
        // System.out.println("HOW 1 ");
        System.out.println(sb);
        // System.out.println("HOW");
    }
}
