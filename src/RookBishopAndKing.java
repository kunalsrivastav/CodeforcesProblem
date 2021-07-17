/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 16-07-2021
 *   Time: 23:23
 *   File: RookBishopAndKing.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/370/A
 * */

public class RookBishopAndKing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        System.out.println(rook(r1, c1, r2, c2) + " " + bishop(r1, c1, r2, c2) + " " + king(r1, c1, r2, c2));
    }

    private static int rook(int r1, int c1, int r2, int c2) {
        return (r1 == r2 || c1 == c2) ? 1 : 2;
    }

    private static int bishop(int r1, int c1, int r2, int c2) {
        if ((r1 + c1) % 2 != (r2 + c2) % 2) {
            return 0;
        } else {
            if ((r1 - c1 == r2 - c2) || (r1 + c1 == r2 + c2)) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    private static int king(int r1, int c1, int r2, int c2) {
        return Math.max(Math.abs(r1 - r2), Math.abs(c1 - c2));
    }
}