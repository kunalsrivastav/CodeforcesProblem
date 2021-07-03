/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 03-07-2021
 *   Time: 15:29
 *   File: YaroslavAndPermutations.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/296/A
 * */

public class YaroslavAndPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int countMaxRepitition = 0, count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                countMaxRepitition = Math.max(countMaxRepitition, count + 1);
                count = 0;
            }
        }
        countMaxRepitition = Math.max(count + 1, countMaxRepitition);
        if (countMaxRepitition <= (n + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}