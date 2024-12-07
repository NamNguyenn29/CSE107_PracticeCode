package ICPC;

import java.util.Scanner;
import java.util.HashMap;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       

        int[] numbers = new int[a];
        for (int i = 0; i < a; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(countPair(numbers));
    }

    public static long countPair(int[] numbers) {
        HashMap<Integer, Integer> frequencyNum = new HashMap<>();
        for (int number : numbers) {
            frequencyNum.put(number, frequencyNum.getOrDefault(number, 0) + 1);
        }
        int MOD = 1000000007;
        long result = 0;
        for (int pair : frequencyNum.values()) {
            if (pair > 1) {
                result = (result + ((long) pair * (pair - 1) / 2) % MOD) % MOD;
            }
        }
        return result;
    }
}
