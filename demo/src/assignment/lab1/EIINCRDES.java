package assignment.lab1;

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (isIncrease(arr)) {
            System.out.println("increasing");
        } else if (isDecrease(arr)) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
    }

    public static boolean isIncrease(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecrease(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
