/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-05-2021
 *   Time: 20:58
 *   File: IQTest.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/25/A
 * */

public class IQTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) == 1) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (countEven > countOdd) {
                if ((arr[i] & 1) == 1) {
                    System.out.println(i+1);
                    break;
                }
            } else {
                if ((arr[i] & 1) == 0) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}