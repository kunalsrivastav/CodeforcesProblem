/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 14:25
 *   File: Parallelepiped.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/224/A
 * */

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a = (int) Math.sqrt((a1 * a2) / a3);
        int b = (int) Math.sqrt((a2 * a3) / a1);
        int c = (int) Math.sqrt((a3 * a1) / a2);
        System.out.println((4 * a) + (4 * b) + (4 * c));
    }
}