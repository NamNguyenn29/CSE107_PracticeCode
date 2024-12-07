package assignment.lab1;

import java.util.Scanner;

public class EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstSentence = sc.nextLine();
        String secondSentence = sc.nextLine();

        var result = -1;
        for (var i = 0; i < firstSentence.length(); i++) {
            String firstEnd = firstSentence.substring(i);
            if (secondSentence.startsWith(firstEnd)) {
                result = i + secondSentence.length();
                break;
            }
        }
        if (result == -1) {
            result = firstSentence.length() + secondSentence.length();
        }
        System.out.println(result);
    }

}
