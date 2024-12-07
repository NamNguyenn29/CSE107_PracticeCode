package assignment.lab5;

import java.util.Scanner;

public class EIUACTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groupSize = sc.nextInt();
        int[] orderPlayer = new int[groupSize];
        int[] players = new int[7];
        for (int i = 0; i < groupSize; i++) {
            int player = sc.nextInt();
            players[player]++;
            orderPlayer[i] = player;
        }
        int ans = 0;
        boolean flag = false;
        for (int i = players.length - 1; i >= 0; i--) {
            if (players[i] == 1) {
                ans = i;
                flag = true;
                break;
            }
        }

        if (flag) {
            for (int i = 0; i < orderPlayer.length; i++) {
                if (ans == orderPlayer[i]) {
                    System.out.println(++i);
                    break;
                }
            }

        } else {
            System.out.println("none");
        }
    }
}
