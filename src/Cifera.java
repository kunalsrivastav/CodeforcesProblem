/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 02-07-2021
 *   Time: 22:57
 *   File: Cifera.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/114/A
 * */

public class Cifera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int count = 0;
        boolean canbe = false;
        if (l%k == 0) {
            canbe = true;
            while (true) {
                l = l / k;
                if (l % k != 0 && l > k) {
                    canbe = false;
                    break;
                }
                count++;
                if (l < k) {
                    break;
                }
            }
        }
        if (l == 1 && canbe) {
            System.out.println("YES");
            System.out.println(count - 1);
        } else {
            System.out.println("NO");
        }
    }
}