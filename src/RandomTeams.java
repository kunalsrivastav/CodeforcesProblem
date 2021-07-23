/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 22-07-2021
 *   Time: 19:58
 *   File: RandomTeams.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/478/B
 * */

public class RandomTeams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long maximim = (long) (n - (m - 1)) * (n - (m - 1) - 1) / 2;
        int size = n / m;
        int remainder = n % m;
        long minimum = (long) remainder * (size + 1) * size / 2 + (long) (m - remainder) * size * (size - 1) / 2;
        System.out.println(minimum + " " + maximim);
    }
}