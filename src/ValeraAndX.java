/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 12:19
 *   File: ValeraAndX.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/404/A
 * */

public class ValeraAndX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        boolean formsX = true;
        char diag = s[0].charAt(0);
        char rest = s[0].charAt(1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && s[i].charAt(j) != diag) || ((i + j == n - 1) && s[i].charAt(j) != diag)){
                    formsX = false;
                    break;
                } else if (i != j && s[i].charAt(j) != rest && (i + j != n - 1)) {
                    formsX = false;
                    break;
                }
            }
        }
        if (diag == rest) {
            formsX = false;
        }
        System.out.println(formsX ? "YES" : "NO");
    }
}