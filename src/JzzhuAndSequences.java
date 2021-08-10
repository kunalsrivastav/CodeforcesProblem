/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 11-08-2021
 *   Time: 00:18
 *   File: JzzhuAndSequences.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/450/B
 * */

public class JzzhuAndSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = (int) (1e9 + 7);
        int[] result = {x, y, y - x, -x, -y, x - y};
        System.out.println(((result[((n - 1) % 6)] % mod) + mod) % mod);
    }
}