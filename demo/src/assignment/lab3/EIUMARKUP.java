package assignment.lab3;

import java.util.*;
import java.io.*;
public class EIUMARKUP {
    public static void main(String[] args) {
        int numOfProducts = reader.nextInt();
        int productPrice = 200;
        int i = 0;
        long totalPrice = 0;

        while(productPrice > 180) {
            totalPrice+= Math.min(100, numOfProducts - i)*productPrice;
            numOfProducts -= Math.min(100, numOfProducts);
            if(numOfProducts == 0) {
                break;
            }
            i+=100;
            productPrice--;
        }
        if(productPrice <= 180  ) {
            totalPrice +=  180*numOfProducts;
        }
        System.out.println(totalPrice);

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
