/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-07-2021
 *   Time: 23:50
 *   File: QueueAtTheSchool.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/266/B
 * */

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine();
        StringBuilder s = new StringBuilder(scanner.nextLine());
        while (t-- > 0) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') {
                    s.setCharAt(i, 'G');
                    s.setCharAt(i + 1, 'B');
                    i++;
                }
            }
        }
        System.out.println(s.toString());
    }
}