/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 30-06-2021
 *   Time: 20:20
 *   File: GregsWorkout.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/255/A
 * */

public class GregsWorkout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int chest = 0, biceps = 0, back = 0;
        for (int i = 0; i < n; i++) {
            int getModulo = (i + 1) % 3;
            if (getModulo == 0) {
                back += array[i];
            } else if (getModulo == 1) {
                chest += array[i];
            } else {
                biceps += array[i];
            }
        }
        if (biceps > chest && biceps > back) {
            System.out.println("biceps");
        } else if (chest > back && chest > biceps) {
            System.out.println("chest");
        } else if (back > biceps && back > chest) {
            System.out.println("back");
        }
    }
}