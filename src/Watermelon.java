/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 18-02-2021
 *   Time: 23:16
 *   File: Watermelon.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/4/A
 * */

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = sc.nextByte();
        boolean possible = num % 2 == 0;
        if (possible && num != 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}