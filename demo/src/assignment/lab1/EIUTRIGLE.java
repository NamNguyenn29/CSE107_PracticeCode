package assignment.lab1;

import java.util.Arrays;
import java.util.Scanner;

class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numOfEdge = new int[n];
        for (int i = 0; i < n; i++) {
            numOfEdge[i] = sc.nextInt();
        }
        Arrays.sort(numOfEdge);
        int count = 0;
        for (int i = 0; i < numOfEdge.length; i++) {
            for (int j = i + 1; j < numOfEdge.length; j++) {
                for (int k = j + 1; k < numOfEdge.length; k++) {
                    if (numOfEdge[i] + numOfEdge[j] > numOfEdge[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
