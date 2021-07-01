/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 12:54
 *   File: WatchingAMovie.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/499/A
 * */

public class WatchingAMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] lArr = new int[n];
        int[] rArr = new int[n];
        for (int i = 0; i < n; i++) {
            lArr[i] = scanner.nextInt();
            rArr[i] = scanner.nextInt();
        }
        int currentTime = 1;
        int totalWatched = 0;
        for (int i = 0; i < n; ) {
            if (currentTime + x <= lArr[i]) {
                currentTime += x;
            } else {
                for (int j = currentTime; j <= rArr[i] ; j++) {
                    totalWatched++;
                }
                currentTime = rArr[i] + 1;
                i++;
            }
        }
        System.out.println(totalWatched);
    }
}