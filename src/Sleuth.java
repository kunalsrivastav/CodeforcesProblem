/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 18:15
 *   File: Sleuth.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/49/A
 * */

public class Sleuth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        boolean answered = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                for (int j = 0; j < vowels.length; j++) {
                    if (s.charAt(i) == vowels[j]) {
                        answered = true;
                        break;
                    }
                }
                if (!answered) {
                    break;
                }
            }
            if (answered) {
                break;
            }
        }
        System.out.println(answered ? "YES" : "NO");
    }
}