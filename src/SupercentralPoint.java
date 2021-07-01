/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 13:10
 *   File: SupercentralPoint.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/165/A
 * */

public class SupercentralPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xArr = new int[n];
        int[] yArr = new int[n];
        for (int i = 0; i < n; i++) {
            xArr[i] = scanner.nextInt();
            yArr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = xArr[i];
            int y = yArr[i];
            boolean upper = false, lower = false, left = false, right = false;
            for (int j = 0; j < n; j++) {
                int newX = xArr[j];
                int newY = yArr[j];
                if (i != j) {
                    if (newX > x && newY == y) {
                        right = true;
                    }
                    if (newX < x && newY == y) {
                        left = true;
                    }
                    if (newX == x && newY < y) {
                        lower = true;
                    }
                    if (newX == x && newY > y) {
                        upper = true;
                    }
                }
            }
            if (left && right && lower && upper) {
                count++;
            }
        }
        System.out.println(count);
    }
}