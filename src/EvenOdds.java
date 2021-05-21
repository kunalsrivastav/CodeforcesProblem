/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 22:55
 *   File: EvenOdds.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/318/A
 * */

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        long n = scanner.nextLong();
        long half = (k + 1) / 2;
        if (n <= half) {
            System.out.println(2 * n - 1);
        } else {
            System.out.println((n - half) * 2);
        }
    }
}