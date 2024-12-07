package assignment.lab2;

import java.util.*;

public class EIUSnail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int days = (v-b-1)/(a-b) +1;
        System.out.println(days);
        sc.close();
    }

}
