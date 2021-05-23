/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-05-2021
 *   Time: 22:37
 *   File: Cakeminator.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/330/A
 * */

public class Cakeminator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        String[] s = new String[r];
        scanner.nextLine();
        for (int i = 0; i < r; i++) {
            s[i] = scanner.nextLine();
        }
        int countRowEvil = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (s[i].charAt(j) == 'S') {
                    countRowEvil++;
                    break;
                }
            }
        }
        int countColumnEvil = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (s[j].charAt(i) == 'S') {
                    countColumnEvil++;
                    break;
                }
            }
        }
        int maxEat = r * c - countRowEvil * countColumnEvil;
        System.out.println(maxEat);
    }
}