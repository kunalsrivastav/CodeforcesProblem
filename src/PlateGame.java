/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 18:38
 *   File: PlateGame.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/197/A
 * */

public class PlateGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println((2 * r > Math.min(a, b)) ? "Second" : "First");
    }
}