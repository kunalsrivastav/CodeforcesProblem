/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-02-2021
 *   Time: 21:40
 *   File: Twins.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/160/A
 * */

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int myCoinSum, coinsUsed;
        int siblingSum = 0;
        myCoinSum = array[n - 1];
        coinsUsed = 1;
        int variableLoop = n - 2;
        for (int i = 0; i <= variableLoop; ) {
            if (siblingSum + array[i] < myCoinSum) {
                siblingSum += array[i];
                i++;
            } else {
                myCoinSum += array[variableLoop];
                variableLoop--;
                coinsUsed++;
            }
        }
        System.out.println(coinsUsed);
    }
}