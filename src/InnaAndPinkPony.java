/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 18-07-2021
 *   Time: 21:32
 *   File: InnaAndPinkPony.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/374/A
 * */

public class InnaAndPinkPony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int minimumMoves = Integer.MAX_VALUE;
        int[] xCorner = {1, 1, n, n};
        int[] yCorner = {1, m, 1, m};
        for (int index = 0; index < 4; index++) {
            int distanceX = Math.abs(xCorner[index] - i);
            int distanceY = Math.abs(yCorner[index] - j);
            if (distanceX == 0 && distanceY == 0) {
                minimumMoves = 0;
                break;
            } else if ((distanceX != 0) && (distanceY != 0) && (distanceX % a == 0) && (distanceY % b == 0) && (Math.abs((distanceX / a) - (distanceY / b)) % 2 == 0)) {
                minimumMoves = Math.min(minimumMoves, Math.max(distanceX / a, distanceY / b));
            } else if ((distanceX == 0) && (a <= n - 1) && (distanceY % b == 0) && ((distanceY / b) % 2 == 0)) {
                minimumMoves = Math.min(minimumMoves, distanceY / b);
            } else if ((distanceY == 0) && (b <= m - 1) && (distanceX % a == 0) && ((distanceX / a) % 2 == 0)) {
                minimumMoves = Math.min(minimumMoves, distanceX / a);
            }
        }
        if (minimumMoves == Integer.MAX_VALUE) {
            System.out.println("Poor Inna and pony!");
        } else {
            System.out.println(minimumMoves);
        }
    }
}