/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 21:13
 *   File: Bar.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/56/A
 * */

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY",
                "WINE", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "15", "16", "17"};
        int count = 0;
        while (n-- > 0) {
            String visitor = scanner.nextLine();
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(visitor)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}