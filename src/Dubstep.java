/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 20:02
 *   File: Dubstep.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/208/A
 * */

public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String wub = "WUB";
        boolean spaceRequired = false;
        for (int i = 0; i < length; ) {
            if (i < length - 2 && s.substring(i, i+3).equals(wub)) {
                i += 3;
                if (spaceRequired) {
                    sb.append(" ");
                    spaceRequired = false;
                }
            } else {
                sb.append(s.charAt(i));
                i++;
                spaceRequired = true;
            }
        }
        System.out.println(sb);
    }
}