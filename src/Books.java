/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 05-08-2021
 *   Time: 00:32
 *   File: Books.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/279/B
 * */

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int countReadBooks = 0, index = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum <= t) {
                countReadBooks++;
            } else {
                sum -= arr[index];
                index++;
            }
        }
        System.out.println(countReadBooks);
    }
}