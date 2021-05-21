/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 22-05-2021
 *   Time: 00:06
 *   File: Dragons.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/230/A
 * */

public class Dragons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for (int i = 0; i < n; i++) {
            arrX[i] = scanner.nextInt();
            arrY[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrX[j] > arrX[j + 1]) {
                    int temp = arrX[j];
                    arrX[j] = arrX[j + 1];
                    arrX[j + 1] = temp;

                    temp = arrY[j];
                    arrY[j] = arrY[j + 1];
                    arrY[j + 1] = temp;
                }
            }
        }
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            if (s > arrX[i]) {
                s += arrY[i];
            } else {
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}