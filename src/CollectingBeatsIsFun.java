/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 03-07-2021
 *   Time: 15:40
 *   File: CollectingBeatsIsFun.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/373/A
 * */

public class CollectingBeatsIsFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[10];
        scanner.nextLine();
        for (int i = 1; i <= 4; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != '.') {
                    int val = Character.getNumericValue(s.charAt(j));
                    arr[val]++;
                }
            }
        }
        boolean possible = true;
        for (int i = 1; i < 10; i++) {
            if (arr[i] > 2 * k) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}