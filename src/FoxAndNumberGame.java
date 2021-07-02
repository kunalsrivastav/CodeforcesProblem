/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 02-07-2021
 *   Time: 23:33
 *   File: FoxAndNumberGame.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/389/A
 * */

public class FoxAndNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int arrayGCD = arr[0];
        for (int j = 1; j < n; j++) {
            arrayGCD = gcd(arrayGCD, arr[j]);
        }
        int sum = n * arrayGCD;
        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }
}