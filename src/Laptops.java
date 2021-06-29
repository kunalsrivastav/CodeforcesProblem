/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 29-06-2021
 *   Time: 18:22
 *   File: Laptops.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/456/A
 * */

public class Laptops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            brr[i] = scanner.nextInt();
        }
        if (n == 1) {
            System.out.println("Poor Alex");
        } else {
            Pair[] pArr = new Pair[n];
            for (int i = 0; i < n; i++) {
                pArr[i] = new Pair();
                pArr[i].val1 = arr[i];
                pArr[i].val2 = brr[i];
            }
            Arrays.sort(pArr);
            boolean possible = false;
            for (int i = 0; i < n - 1; i++) {
                if (pArr[i].val2 > pArr[i + 1].val2) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? "Happy Alex" : "Poor Alex");
        }
    }

    static class Pair implements Comparable<Pair> {
        int val1;
        int val2;
        public int compareTo(Pair o) {
            return val1-o.val1;
        }
    }
}