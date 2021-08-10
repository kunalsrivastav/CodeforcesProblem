/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-08-2021
 *   Time: 22:27
 *   File: SortTheArray.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/451/B
 * */

public class SortTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != newArr[i]) {
                left = i;
                break;
            }
        }
        int right = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != newArr[i]) {
                right = i;
                break;
            }
        }
        int lCopy = left + 1, rCopy = right + 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        boolean equal = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != newArr[i]) {
                equal = false;
                break;
            }
        }
        if (equal) {
            System.out.println("yes");
            System.out.println(lCopy + " " + rCopy);
        } else {
            System.out.println("no");
        }
    }
}