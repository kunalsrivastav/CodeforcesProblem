/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 08-07-2021
 *   Time: 23:19
 *   File: CowsAndPrimitiveRoots.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/284/A
 * */

public class CowsAndPrimitiveRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean possible = true;
            for (int j = 1; j < n - 1; j++) {
                int val = power(i, j, n) - 1;
                val = val % n;
                if (val == 0) {
                    possible = false;
                    break;
                }
            }
            if (possible && ((power(i, n - 1, n) - 1) % n) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static int power(int x, int y, int p) {
        int res = 1;
        x = x % p;
        if (x == 0) {
            return 0;
        }
        while (y > 0) {
            if ((y & 1) != 0) {
                res = (res * x) % p;
            }
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
}