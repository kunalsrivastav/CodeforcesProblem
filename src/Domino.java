/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 02-07-2021
 *   Time: 22:33
 *   File: Domino.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/353/A
 * */

public class Domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xArr = new int[n];
        int[] yArr = new int[n];
        for (int i = 0; i < n; i++) {
            xArr[i] = scanner.nextInt();
            yArr[i] = scanner.nextInt();
        }
        int sumOfUpper = 0, sumOfLower = 0;
        for (int i = 0; i < n; i++) {
            sumOfUpper += xArr[i];
            sumOfLower += yArr[i];
        }
        if ((sumOfUpper % 2 == 1 && sumOfLower % 2 == 0) || (sumOfUpper % 2 == 0 && sumOfLower % 2 == 1)) {
            System.out.println(-1);
        } else if (sumOfUpper % 2 != 0 && sumOfLower % 2 != 0) {
            boolean possible = false;
            for (int i = 0; i < n; i++) {
                if ((xArr[i] % 2 != 0 && yArr[i] % 2 == 0) || xArr[i] % 2 == 0 && yArr[i] % 2 != 0) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? 1 : -1);
        } else {
            System.out.println(0);
        }
    }
}