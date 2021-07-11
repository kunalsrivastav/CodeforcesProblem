/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 11-07-2021
 *   Time: 12:08
 *   File: Exams.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/194/A
 * */

public class Exams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k - 2 * n == 0) {
            System.out.println(n);
        } else if (k - 2 * n >= n) {
            System.out.println(0);
        } else {
            System.out.println(3 * n - k);
        }
    }
}