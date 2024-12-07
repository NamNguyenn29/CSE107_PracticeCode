    package assignment.lab8;

    import java.util.Scanner;

    public class EIUFF {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double r = scanner.nextDouble();
            double f = scanner.nextDouble();
            double Y = scanner.nextDouble();
            int N = scanner.nextInt();

            r /= 100.0;
            f /= 100.0;

            double low = 0;
            double high = 1e10;

            while (high - low > 1e-5) {
                double mid = (low + high) / 2.0;
                if (isSufficient(mid, r, f, Y, N) > 0) {
                    high = mid;
                } else {
                    low = mid;
                }
            }

            high = Math.round(high * 10000);
            System.out.print(high / 10000);

            scanner.close();
        }

        private static double isSufficient(double X, double r, double f, double Y, int N) {
            for (int i = 0; i < N - 1; i++) {
                double withdrawal = Y * Math.pow(1 + f, i);
                X = X * (1 + r) - withdrawal;
            }
            return X;
        }
    }