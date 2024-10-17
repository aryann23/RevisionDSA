//Question link : https://www.hackerrank.com/challenges/halloween-sale/problem

import java.util.Arrays;
import java.util.List;

class HalloweenSale {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        int p = 63;
        int d = 64;
        int m = 9;
        int s = 1242;

        int count = 0;
        while (s >= p) {
            s = s - p;
            count++;

            if (p - d >= m) {
                p = p - d;
            } else {
                p = m;

            }
            System.out.print("budget: " + s + " currentPrice: " + p + " count: " + count);
            System.out.println();
        }

        System.out.print("final count:" + count);
    }
}