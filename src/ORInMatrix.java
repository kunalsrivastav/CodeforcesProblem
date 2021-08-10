/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-08-2021
 *   Time: 18:59
 *   File: ORInMatrix.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/486/B
 * */

public class ORInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] brr = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                brr[i][j] = scanner.nextInt();
            }
        }
        int[][] arr = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (brr[i][j] == 1) {
                    boolean checkRow = true, checkCol = true;
                    for (int row = 1; row <= n; row++) {
                        if (brr[i][row] == 0) {
                            checkRow = false;
                            break;
                        }
                    }
                    for (int col = 1; col <= m; col++) {
                        if (brr[col][j] == 0) {
                            checkCol = false;
                            break;
                        }
                    }
                    if (checkCol && checkRow) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        int[][] newArr = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                boolean oneInRow = false;
                for (int row = j; row <= n; row++) {
                    if (arr[i][row] == 1) {
                        oneInRow = true;
                        break;
                    }
                }
                boolean oneInColumn = false;
                for (int col = i; col <= m; col++) {
                    if (arr[col][j] == 1) {
                        oneInColumn = true;
                        break;
                    }
                }
                if (oneInRow) {
                    for (int row = j; row <= n; row++) {
                        newArr[i][row] = 1;
                    }
                }
                if (oneInColumn) {
                    for (int col = i; col <= m; col++) {
                        newArr[col][j] = 1;
                    }
                }
            }
        }
        boolean possible = true;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (newArr[i][j] != brr[i][j]) {
                    possible = false;
                    break;
                }
            }
        }
        if (possible) {
            System.out.println("YES");
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }
}