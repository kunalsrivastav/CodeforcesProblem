/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-08-2021
 *   Time: 20:17
 *   File: BeforeAnExam.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/contest/4/problem/B
 * */

public class BeforeAnExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int sumTime = scanner.nextInt();
        int[] minTime = new int[d];
        int[] maxTime = new int[d];
        for (int i = 0; i < d; i++) {
            minTime[i] = scanner.nextInt();
            maxTime[i] = scanner.nextInt();
        }
        int minSum = 0, maxSum = 0;
        for (int i = 0; i < d; i++) {
            maxSum += maxTime[i];
            minSum += minTime[i];
        }
        if (maxSum >= sumTime && sumTime >= minSum) {
            System.out.println("YES");
            sumTime -= minSum;
            for (int i = 0; i < d; i++) {
                if (sumTime > 0) {
                    System.out.print((minTime[i] + Math.min(sumTime, maxTime[i] - minTime[i])) + " ");
                    sumTime -= Math.min(sumTime, maxTime[i] - minTime[i]);
                } else {
                    System.out.print(minTime[i] + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }
}