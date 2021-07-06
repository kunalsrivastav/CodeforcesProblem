/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 22:11
 *   File: HelpVasilisaTheWise2.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/143/A
 * */

public class HelpVasilisaTheWise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int val1 = r1 + c1 - d2;
        int val2 = r1 + c2 - d1;
        int val3 = c1 + d2 - r1;
        int val4 = c2 + d1 - r1;
        int a = -1, b = -1, c = -1, d = -1;
        if (val1 >= 0 && (val1 % 2) == 0) {
            a = val1 / 2;
        }
        if (val2 >= 0 && (val2 % 2) == 0) {
            b = val2 / 2;
        }
        if (val3 >= 0 && (val3 % 2) == 0) {
            c = val3 / 2;
        }
        if (val4 >= 0 && (val4 % 2) == 0) {
            d = val4 / 2;
        }

        if (((a > 0 && a < 10) && (b > 0 && b < 10) && (c > 0 && c < 10) && (d > 0 && d < 10)) && (a != b && a != c && a != d && b != c && b != d && c != d)) {
            if ((a + b == r1) && (c + d == r2) && (a + c == c1) && (b + d == c2) && (a + d == d1) && (b + c == d2)) {
                System.out.println(a + " " + b);
                System.out.println(c + " " + d);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }
}