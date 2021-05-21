/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 22:41
 *   File: IWannaBeTheGuy.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/469/A
 * */

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] arrX = new int[p];
        for (int i = 0; i < p; i++) {
            arrX[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] arrY = new int[q];
        for (int i = 0; i < q; i++) {
            arrY[i] = scanner.nextInt();
        }
        int[] arr = new int[n+1];
        for (int i = 0; i < p; i++) {
            arr[arrX[i]] = 1;
        }
        for (int i = 0; i < q; i++) {
            arr[arrY[i]] = 1;
        }
        boolean possible = true;
        for (int i = 1; i <= n; i++) {
            if (arr[i] != 1) {
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}