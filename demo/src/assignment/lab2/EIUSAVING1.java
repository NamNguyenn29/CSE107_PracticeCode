package assignment.lab2;

import java.util.*;
import java.io.*;

public class EIUSAVING1 {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        double money = ir.nextDouble();
        int month = ir.nextInt();
        double[] rates = new double[] { 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        double total = 0;
        if(month<= 12) {
            total = money*(rates[month-1]/100/12*month+1);
        } else {
            int countYear = month/12;
            total+= money*(rates[11]/100/12*countYear+1);
            int countMonth = month%12;
            total+= money*(rates[countMonth-1]/100/12*countMonth  );
        }
        System.out.println((long)Math.round(total));
        
    }

    static InputReader reader = new InputReader(System.in);

    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
