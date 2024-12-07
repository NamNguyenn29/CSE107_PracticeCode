package assignment.lab2;

import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        num %= 18;
        String finger = "";
        String hand;

        if ((num >= 6 && num <= 14)) {
            hand = "phai";
        } else {
            hand = "trai";
        }
        while (num > 10) {
            num = 20 - num;
        }
        if (num == 1 || num == 10) {
            finger = "cai";
        }
        if (num == 2 || num == 9) {
            finger = "tro";
        }
        if (num == 3 || num == 8) {
            finger = "giua";
        }
        if (num == 4 || num == 7) {
            finger = "ap ut";
        }
        if (num == 5 || num == 6) {
            finger = "ut";
        }
        System.out.printf("Ngon %s cua ban tay %s", finger, hand);
        sc.close();
    }

}
