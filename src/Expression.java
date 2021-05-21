/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 22:11
 *   File: Expression.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/479/A
 * */

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int method1 = a + b * c;
        int method2 = a * (b + c);
        int method3 = a * b * c;
        int method4 = (a + b) * c;
        int method5 = a + b + c;
        int method6 = a * b + c;
        int max = Math.max(Math.max(method1, method2), Math.max(Math.max(method3, method4), Math.max(method5, method6)));
        System.out.println(max);
    }
}