/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 18:19
 *   File: TL.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/350/A
 * */

public class TL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nArr = new int[n];
        int[] mArr = new int[m];
        for (int i = 0; i < n; i++) {
            nArr[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            mArr[i] = scanner.nextInt();
        }
        Arrays.sort(nArr);
        Arrays.sort(mArr);
        int tMinimum = 2 * nArr[0];
        tMinimum = Math.max(tMinimum, nArr[n - 1]);
        if (mArr[0] <= tMinimum) {
            System.out.println(-1);
        } else {
            System.out.println(tMinimum);
        }
    }
}