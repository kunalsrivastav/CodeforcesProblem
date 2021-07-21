/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-07-2021
 *   Time: 23:59
 *   File: XeniaAndRingroad.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/339/B
 * */

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        long count = 0;
        int position = 1;
        for (int i = 0; i < m; i++) {
            if (arr[i] == position) {
                continue;
            } else if (arr[i] > position) {
                count += (long) (arr[i] - position);
                position = arr[i];
            } else if (arr[i] < position) {
                count += (long) (arr[i] + n - position);
                position = arr[i];
            }
        }
        System.out.println(count);
    }
}