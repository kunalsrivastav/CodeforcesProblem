/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 14:35
 *   File: DZYLovesChessboard.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/445/A
 * */

public class DZYLovesChessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder[] s = new StringBuilder[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = new StringBuilder(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == '.') {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            s[i].setCharAt(j, 'B');
                        } else {
                            s[i].setCharAt(j, 'W');
                        }
                    } else {
                        if (j % 2 == 0) {
                            s[i].setCharAt(j, 'W');
                        } else {
                            s[i].setCharAt(j, 'B');
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}