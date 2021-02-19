/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 19-02-2021
 *   Time: 23:32
 *   File: PetyaAndStrings.java
 */

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        int length = s1.length();
        boolean lexicoSmall = false, lexicoEqual = false;
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                lexicoSmall = true;
                lexicoEqual = false;
                break;
            } else if (s1.charAt(i) == s2.charAt(i)) {
                lexicoEqual = true;
                lexicoSmall = false;
            } else {
                System.out.println("1");
                lexicoSmall = lexicoEqual = false;
                break;
            }
        }
        if (lexicoEqual) {
            System.out.println("0");
        } else if (lexicoSmall) {
            System.out.println("-1");
        }
    }
}