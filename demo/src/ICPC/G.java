package ICPC;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int p = sc.nextInt();
        int q = sc.nextInt();

        int  count = 0;
        for(int i = p-1;i<=p+1;i++) {
            for(int j = q-1;j<=q+1;j++) {
                if(i>=1 && i<=m && j>=1 && j<=n) {
                    count++;
                }
            }
        }
        System.out.println(count-1);
    }
    
}
