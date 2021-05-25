/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 24-05-2021
 *   Time: 19:54
 *   File: ApplemanAndEasyTask.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/462/A
 * */

public class ApplemanAndEasyTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        boolean havingEvenCell = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (i - 1 >= 0 && s[i - 1].charAt(j) == 'o') {
                    count++;
                }
                if (i + 1 < n && s[i + 1].charAt(j) == 'o') {
                    count++;
                }
                if (j - 1 >= 0 && s[i].charAt(j - 1) == 'o') {
                    count++;
                }
                if (j + 1 < n && s[i].charAt(j + 1) == 'o') {
                    count++;
                }
                if (count % 2 == 1) {
                    havingEvenCell = false;
                    break;
                }
            }
            if (!havingEvenCell) {
                break;
            }
        }
        if (havingEvenCell) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}