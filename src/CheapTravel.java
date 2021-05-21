/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 23:02
 *   File: CheapTravel.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/466/A
 * */

public class CheapTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int minCost = 0;
        if (n <= m) {
            minCost = Math.min(b, n * a);
        } else {
            int combo = n / m;
            int single = n % m;
            minCost = Math.min(n * a, Math.min((combo * b) + (single * a), b * (n / m + 1)));
        }
        System.out.println(minCost);
    }
}