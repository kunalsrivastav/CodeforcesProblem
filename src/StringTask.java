/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 19-02-2021
 *   Time: 23:21
 *   File: StringTask.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/118/A
 * */

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y') {
                System.out.print("." + s.charAt(i));
            }
        }
    }
}