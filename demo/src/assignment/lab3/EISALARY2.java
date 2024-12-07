package assignment.lab3;

import java.util.Scanner;

public class EISALARY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeNum = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        double officeHour = 0;
        double overtimeHour = 0;
        double officeSalary = 0;
        double overSalary = 0;
        double rate = 0;
        for (int i = 0; i < employeeNum; i++) {
            double officetime = 0;
            double overtime = 0;
            for (int j = 0; j < 5; j++) {
                double hour = sc.nextDouble();
                officetime += Math.min(hour, 8);
                overtime += Math.max(0, hour - 8);
            }
            rate = sc.nextDouble();
            double officetimeSalary = officetime * rate;
            double overtimeSalary = overtime * rate * 1.5;
            ans.append((double) Math.round((officetimeSalary + overtimeSalary) * 100) / 100).append("\n");
            officeHour += officetime;
            overtimeHour += overtime;
            officeSalary += officetimeSalary;
            overSalary += overtimeSalary;

        }
        System.out.print(ans);
        System.out.println((double) Math.round((officeSalary / officeHour) * 100) / 100);
        System.out.println((double) Math.round((overSalary / overtimeHour) * 100) / 100);
        sc.close();

    }

}
