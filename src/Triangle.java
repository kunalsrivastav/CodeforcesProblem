/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-07-2021
 *   Time: 12:24
 *   File: Triangle.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/18/A
 * */

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        if (checkRight(x1, y1, x2, y2, x3, y3)) {
            System.out.println("RIGHT");
        } else if (checkAlmostRight(x1, y1, x2, y2, x3, y3)) {
            System.out.println("ALMOST");
        } else {
            System.out.println("NEITHER");
        }
    }

    private static boolean checkRight(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
            return false;
        }
        int distOne = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        int distTwo = (int) (Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        int distThree = (int) (Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        if (distOne == (distTwo + distThree) || distTwo == (distOne + distThree) || distThree == (distTwo + distOne)) {
            return true;
        }
        return false;
    }

    private static boolean checkAlmostRight(int x1, int y1, int x2, int y2, int x3, int y3) {
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            if (checkRight(x1 + x[i], y1 + y[i], x2, y2, x3, y3)) {
                return true;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (checkRight(x1, y1, x2 + x[i], y2 + y[i], x3, y3)) {
                return true;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (checkRight(x1, y1, x2, y2, x3 + x[i], y3 + y[i])) {
                return true;
            }
        }
        return false;
    }
}