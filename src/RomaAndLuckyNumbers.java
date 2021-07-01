/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 13:26
 *   File: RomaAndLuckyNumbers.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/262/A
 * */

public class RomaAndLuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = array[i];
            int countLucky = 0;
            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                if (digit == 7 || digit == 4) {
                    countLucky++;
                }
            }
            if (countLucky <= k) {
                count++;
            }
        }
        System.out.println(count);
    }
}