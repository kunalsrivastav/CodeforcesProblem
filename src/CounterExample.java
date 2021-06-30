/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 30-06-2021
 *   Time: 20:31
 *   File: CounterExample.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/483/A
 * */

public class CounterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        if (l%2 != 0) {
            l++;
        }
        if (r - l < 2) {
            System.out.println(-1);
        } else {
            System.out.println(l + " " + (l + 1) + " " + (l + 2));
        }
    }
}