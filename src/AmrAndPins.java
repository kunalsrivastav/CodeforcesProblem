/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 27-07-2021
 *   Time: 21:35
 *   File: AmrAndPins.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/507/B
 * */

public class AmrAndPins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long r = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long newX = scanner.nextLong();
        long newY = scanner.nextLong();
        System.out.println((int) (Math.ceil(Math.sqrt((newX - x) * (newX - x) + (newY - y) * (newY - y)) / ( 2 * r))));
    }
}