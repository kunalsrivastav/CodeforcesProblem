/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 14-07-2021
 *   Time: 19:08
 *   File: SnowFootprints.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/298/A
 * */

public class SnowFootprints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        boolean containsL = false, containsR = false;
        int lStartIndex = 0, rStartIndex = 0;
        int lLastIndex = 0, rLastIndex = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                if (!containsL) {
                    lStartIndex = i;
                }
                containsL = true;
                if (s.charAt(i + 1) == '.' || s.charAt(i + 1) == 'R') {
                    lLastIndex = i;
                }
            }
            if (s.charAt(i) == 'R') {
                if (!containsR) {
                    rStartIndex = i;
                }
                containsR = true;
                if (s.charAt(i + 1) == '.' || s.charAt(i + 1) == 'L') {
                    rLastIndex = i;
                }
            }
        }
        if (containsL && !containsR) {
            System.out.println((lLastIndex + 1) + " " + (lStartIndex - 1 + 1));
        } else if (containsR & !containsL) {
            System.out.println((rStartIndex + 1) + " " + (rLastIndex + 1 + 1));
        } else if (containsL && containsR) {
            System.out.println((rStartIndex + 1) + " " + (rLastIndex + 1));
        }
    }
}