/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 17:52
 *   File: CutRibbon.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/189/A
 * */

public class CutRibbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int maxPieces = 0;
        for (int i = 0; i <= 4000; i++) {
            for (int j = 0; j <= 4000; j++) {
                int kc = n - (i * a + j * b);
                if (kc < 0) {
                    break;
                }
                if (kc % c == 0) {
                    maxPieces = Integer.max(maxPieces, i + j + kc/c);
                }
            }
        }
        System.out.println(maxPieces);
    }
}