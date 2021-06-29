/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 29-06-2021
 *   Time: 18:12
 *   File: LunchRush.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/276/A
 * */

public class LunchRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] fArr = new int[n];
        int[] tArr = new int[n];
        for (int i = 0; i < n; i++) {
            fArr[i] = scanner.nextInt();
            tArr[i] = scanner.nextInt();
        }
        int maximumJoy = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentJoy = fArr[i];
            if (tArr[i] > k) {
                currentJoy = fArr[i] - (tArr[i] - k);
            }
            maximumJoy = Math.max(maximumJoy, currentJoy);
        }
        System.out.println(maximumJoy);
    }
}