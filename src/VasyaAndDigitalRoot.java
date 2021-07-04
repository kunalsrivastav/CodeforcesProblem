/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 04-07-2021
 *   Time: 20:16
 *   File: VasyaAndDigitalRoot.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/355/A
 * */

public class VasyaAndDigitalRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        if (d == 0 && k != 1) {
            System.out.println("No solution");
        } else {
            System.out.print(d);
            for (int i = 1; i < k; i++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}