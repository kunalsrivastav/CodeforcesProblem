/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 21:45
 *   File: Marks.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/152/A
 * */

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] s = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        int[] maxMarks = new int[m];
        for (int i = 0; i < m; i++) {
            int max = Character.getNumericValue(s[0].charAt(i));
            for (int j = 0; j < n; j++) {
                max = Math.max(max, Character.getNumericValue(s[j].charAt(i)));
            }
            maxMarks[i] = max;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int getCurrentMarks = Character.getNumericValue(s[i].charAt(j));
                if (getCurrentMarks == maxMarks[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}