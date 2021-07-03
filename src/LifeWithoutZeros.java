/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 03-07-2021
 *   Time: 15:11
 *   File: LifeWithoutZeros.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/75/A
 * */

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        String aCopy = String.valueOf(a);
        String bCopy = String.valueOf(b);
        String cCopy = String.valueOf(c);
        StringBuilder cWithoutZero = new StringBuilder();
        for (int i = 0; i < cCopy.length(); i++) {
            if (cCopy.charAt(i) != '0') {
                cWithoutZero.append(cCopy.charAt(i));
            }
        }
        int newC = Integer.parseInt(cWithoutZero.toString());
        StringBuilder aWithoutZero = new StringBuilder();
        StringBuilder bWithoutZero = new StringBuilder();
        for (int i = 0; i < aCopy.length(); i++) {
            if (aCopy.charAt(i) != '0') {
                aWithoutZero.append(aCopy.charAt(i));
            }
        }
        for (int i = 0; i < bCopy.length(); i++) {
            if (bCopy.charAt(i) != '0') {
                bWithoutZero.append(bCopy.charAt(i));
            }
        }
        int newA = Integer.parseInt(aWithoutZero.toString());
        int newB = Integer.parseInt(bWithoutZero.toString());
        if (newA + newB == newC) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}