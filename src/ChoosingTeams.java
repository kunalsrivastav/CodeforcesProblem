/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-05-2021
 *   Time: 22:20
 *   File: ChoosingTeams.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/432/A
 * */

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n < 3) {
            System.out.println(0);
        } else {
            Arrays.sort(arr);
            int maxNumberOfTeams = 0;
            int i = 2;
            while (true) {
                if (i >= n) {
                    break;
                }
                if (5 - arr[i] >= k) {
                    maxNumberOfTeams++;
                    i += 3;
                } else {
                    break;
                }
            }
            System.out.println(maxNumberOfTeams);
        }
    }
}