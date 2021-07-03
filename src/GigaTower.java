/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 03-07-2021
 *   Time: 14:54
 *   File: GigaTower.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/488/A
 * */

public class GigaTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        int aCopy;
        for (int i = 1; i <= 20; i++) {
            aCopy = a + i;
            b++;
            boolean found = false;
            while (aCopy != 0) {
                int num = aCopy % 10;
                if (num == 8 || num == -8) {
                    found = true;
                    break;
                }
                aCopy = aCopy / 10;
            }
            if (found) {
                break;
            }
        }
        System.out.println(b);
    }
}