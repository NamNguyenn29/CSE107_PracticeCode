package ICPC;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        int[] weights = new int[N];
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        int[] dp = new int[W + 1];
        boolean[][] selectedItems = new boolean[W + 1][N];

        for (int i = 0; i < N; i++) {
            int w = weights[i];
            int v = values[i];
            for (int currentWeight = W; currentWeight >= w; currentWeight--) {
                if (dp[currentWeight] < dp[currentWeight - w] + v) {
                    dp[currentWeight] = dp[currentWeight - w] + v;
                    System.arraycopy(selectedItems[currentWeight - w], 0, selectedItems[currentWeight], 0, N);
                    selectedItems[currentWeight][i] = true; // Đánh dấu vật phẩm này đã được chọn
                }
            }
        }

        int maxValue = 0;
        for (int i = 0; i <= W; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }

        for (int i = 0; i < N; i++) {
            if (weights[i] <= H) {
                for (int currentWeight = 0; currentWeight <= W; currentWeight++) {
                    if (!selectedItems[currentWeight][i]) {
                        maxValue = Math.max(maxValue, dp[currentWeight] + values[i]);
                    }
                }
            }
        }

        System.out.println(maxValue);
        sc.close();
    }
}
