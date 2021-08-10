/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-08-2021
 *   Time: 22:13
 *   File: DZYLovesStrings.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/447/B
 * */

public class DZYLovesStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine());
        int k = scanner.nextInt();
        int[] weightArr = new int[26];
        for (int i = 0; i < weightArr.length; i++) {
            weightArr[i] = scanner.nextInt();
        }
        int maxWeight = weightArr[0], index = 0;
        for (int i = 0; i < weightArr.length; i++) {
            if (weightArr[i] > maxWeight) {
                maxWeight = weightArr[i];
                index = i;
            }
        }
        while (k-- > 0) {
            s.append((char) (index + 97));
        }
        int count = 0;
        for (int i = 1; i <= s.length(); i++) {
            count += (i * weightArr[s.toString().charAt(i - 1) - 97]);
        }
        System.out.println(count);
    }
}