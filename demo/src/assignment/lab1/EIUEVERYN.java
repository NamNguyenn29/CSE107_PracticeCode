package assignment.lab1;

import java.io.*;
import java.util.*;

class EIUEVERYN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int numOfCase = sc.nextInt();
        for (int i = 0; i < numOfCase; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            TreeSet<Integer> numbers = new TreeSet<Integer>();
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                if (num >= 1 && num <= n) {
                    numbers.add(num);
                }
            }
            if (numbers.size() == n) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.print(sb);
    }
}