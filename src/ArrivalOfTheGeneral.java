/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 26-02-2021
 *   Time: 23:50
 *   File: ArrivalOfTheGeneral.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/144/A
 * */

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0], minIndex = 0;
        for (int i = 1; i < num; i++) {
            if (min >= array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        int countSwaps = 0;
        for (int i = minIndex; i < num - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            countSwaps++;
        }
        int max = array[0], maxIndex = 0;
        for (int i = 1; i < num; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        for (int i = maxIndex; i > 0; i--) {
            int temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
            countSwaps++;
        }
        System.out.println(countSwaps);
    }
}