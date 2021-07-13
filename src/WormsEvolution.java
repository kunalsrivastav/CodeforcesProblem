/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 18:06
 *   File: WormsEvolution.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/31/A
 * */

public class WormsEvolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean found = false;
        outerLoop: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && i != k && j != k && arr[i] == arr[j] + arr[k]) {
                        System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
                        found = true;
                        break outerLoop;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}