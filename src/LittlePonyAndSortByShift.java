/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-08-2021
 *   Time: 23:55
 *   File: LittlePonyAndSortByShift.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/454/B
 * */

public class LittlePonyAndSortByShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = 0;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                index = i;
                break;
            }
        }
        int[] newArr = new int[n];
        for (int i = 0; i < n - index; i++) {
            newArr[i] = arr[index + i];
        }
        for (int i = 0; i < index; i++) {
            newArr[n - index + i] = arr[i];
        }
        boolean possible = true;
        int count = 0;
        if (index != 0) {
            count = n - index;
            for (int i = 0; i < n - 1; i++) {
                if (newArr[i] > newArr[i + 1]) {
                    possible = false;
                    break;
                }
            }
        }
        System.out.println(possible ? count : -1);
    }
}