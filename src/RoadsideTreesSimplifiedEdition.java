/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 11-08-2021
 *   Time: 00:53
 *   File: RoadsideTreesSimplifiedEdition.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/265/B
 * */

public class RoadsideTreesSimplifiedEdition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = arr[0] + 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i]) {
                count += arr[i] - arr[i - 1] + 1 + 1;
            } else {
                count += arr[i - 1] - arr[i] + 1 + 1;
            }
        }
        System.out.println(count);
    }
}