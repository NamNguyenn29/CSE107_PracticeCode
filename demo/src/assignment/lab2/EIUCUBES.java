package assignment.lab2;

import java.util.*;

public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfBrick = sc.nextInt();
        int sum = 0;
        int i = 1;
        int totalSum = 0;
        int floor = 0;
        while (true) {
            sum += i;
            totalSum += sum;
            if (totalSum > numOfBrick) {
                break;
            }
            floor++;
            i++;
        }
        System.out.println(floor);
        sc.close();
    }

}
