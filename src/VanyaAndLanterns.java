/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 05-08-2021
 *   Time: 22:47
 *   File: VanyaAndLanterns.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/492/B
 * */

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        double maxDistance = Math.max(arr[0], l - arr[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arr[i] - arr[i + 1]) / 2.0);
        }
        System.out.println(maxDistance);
    }
}