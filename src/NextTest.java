/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 09-07-2021
 *   Time: 23:27
 *   File: NextTest.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/27/A
 * */

public class NextTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int index = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != (i + 1)) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}