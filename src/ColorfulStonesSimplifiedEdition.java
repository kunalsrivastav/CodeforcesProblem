/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 02-07-2021
 *   Time: 22:28
 *   File: ColorfulStonesSimplifiedEdition.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/265/A
 * */

public class ColorfulStonesSimplifiedEdition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int currentPosition = 1;
        int sIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (sIndex < s.length()) {
                if (t.charAt(i) == s.charAt(sIndex)) {
                    currentPosition++;
                    sIndex++;
                }
            }
        }
        System.out.println(currentPosition);
    }
}