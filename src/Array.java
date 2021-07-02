/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 02-07-2021
 *   Time: 23:13
 *   File: Array.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/300/A
 * */

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative.add(arr[i]);
            } else if (arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                zero.add(arr[i]);
            }
        }
        if (positive.size() == 0) {
            int num1 = negative.get(negative.size() - 1);
            positive.add(num1);
            negative.remove(negative.size() - 1);
            int num2 = negative.get(negative.size() - 1);
            positive.add(num2);
            negative.remove(negative.size() - 1);
        }
        if (negative.size() % 2 == 0) {
            zero.add(negative.get(negative.size() - 1));
            negative.remove(negative.size() - 1);
        }
        System.out.print(negative.size() + " ");
        for (Integer integer : negative) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.print(positive.size() + " ");
        for (Integer integer : positive) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.print(zero.size() + " ");
        for (Integer integer : zero) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}