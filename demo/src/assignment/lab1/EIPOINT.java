package assignment.lab1;

import java.util.Scanner;

class EIPOINT {

    public static void main(String[] args) {
        int[] scores = { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] grades = { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        for (int i = 0; i < scores.length; i++) {
            if (score >= scores[i]) {
                System.out.println(grades[i]);
                break;
            }

        }
    }
}
