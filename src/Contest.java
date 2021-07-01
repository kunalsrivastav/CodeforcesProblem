/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 17:43
 *   File: Contest.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/501/A
 * */

public class Contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int totalMisha = Integer.max((3 * a) / 10, a - ((a / 250) * c));
        int totalVasya = Integer.max((3 * b) / 10, b - ((b / 250) * d));
        if (totalMisha > totalVasya) {
            System.out.println("Misha");
        } else if (totalVasya > totalMisha) {
            System.out.println("Vasya");
        } else {
            System.out.println("Tie");
        }
    }
}