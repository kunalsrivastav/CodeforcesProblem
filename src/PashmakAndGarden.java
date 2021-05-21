/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 23:36
 *   File: PashmakAndGarden.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/459/A
 * */

public class PashmakAndGarden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2 || y1 == y2) {
            if (x1 != x2) {
                int x4 = x1;
                int y4 = y1 + (x1 - x2);
                int x3 = x2;
                int y3 = y4;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else {
                int x4 = x1 + (y1 - y2);
                int y4 = y1;
                int x3 = x4;
                int y3 = y2;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            }
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            int x4 = x2;
            int y4 = y1;
            int x3 = x1;
            int y3 = y2;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        } else {
                System.out.println(-1);
        }
    }
}