/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 29-06-2021
 *   Time: 19:06
 *   File: SoftDrinking.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/151/A
 * */

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();
        int totalToast = (k * l) / nl;
        int totalLime = c * d;
        int totalSalt = p / np;
        int maxToast = Math.min(totalToast, Math.min(totalLime, totalSalt)) / n;
        System.out.println(maxToast);
    }
}