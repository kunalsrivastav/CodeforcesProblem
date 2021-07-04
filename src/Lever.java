/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 04-07-2021
 *   Time: 23:10
 *   File: Lever.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/376/A
 * */

public class Lever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int indexOfPivot = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '^') {
                indexOfPivot = i;
                break;
            }
        }
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != indexOfPivot && s.charAt(i) != '=') {
                int weight = Character.getNumericValue(s.charAt(i));
                sum += weight * (i - indexOfPivot);
            }
        }
        if (sum == 0) {
            System.out.println("balance");
        } else if (sum > 0) {
            System.out.println("right");
        } else {
            System.out.println("left");
        }
    }
}