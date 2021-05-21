/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 27-02-2021
 *   Time: 00:21
 *   File: Games.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/268/A
 * */

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        // arr1 -> cost of iTH teams Home
        // arr2 -> cost of iTH guest uniforms
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}