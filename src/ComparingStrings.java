/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 05-07-2021
 *   Time: 23:41
 *   File: ComparingStrings.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/186/A
 * */

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.length() != b.length()) {
            System.out.println("NO");
        } else {
            int[] aFreq = new int[26];
            int[] bFreq = new int[26];
            for (int i = 0; i < a.length(); i++) {
                aFreq[a.charAt(i) - 97]++;
            }
            for (int i = 0; i < b.length(); i++) {
                bFreq[b.charAt(i) - 97]++;
            }
            int countDiff = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    countDiff++;
                }
            }
            boolean sameRace = true;
            for (int i = 0; i < 26; i++) {
                if (aFreq[i] != bFreq[i]) {
                    sameRace = false;
                    break;
                }
            }
            System.out.println((sameRace && countDiff == 2) ? "YES" : "NO");
        }
    }
}