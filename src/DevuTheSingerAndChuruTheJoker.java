/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-05-2021
 *   Time: 20:27
 *   File: DevuTheSingerAndChuruTheJoker.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/439/A
 * */

public class DevuTheSingerAndChuruTheJoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int devu = 0, churu = 0;
        for (int i = 0; i < n; i++) {
            if (d >= arr[i]) {
                d -= arr[i];
                devu++;
            } else {
                break;
            }
            if (d < 0) {
                break;
            }
            if (d - 5 > 0) {
                d -= 5;
                churu++;
            }
            if (d - 5 > 0) {
                d -= 5;
                churu++;
            } else {
                break;
            }
        }
        if (devu == n) {
            if (d >= 5 && d < 10) {
                churu++;
            } else if (d >= 10) {
                churu += d / 5;
            }
            System.out.println(churu);
        } else {
            System.out.println(-1);
        }
    }
}