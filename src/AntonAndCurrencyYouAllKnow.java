/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 26-07-2021
 *   Time: 19:53
 *   File: AntonAndCurrencyYouAllKnow.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/508/B
 */

public class AntonAndCurrencyYouAllKnow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] digit = scanner.nextLine().toCharArray();
        int index = -1;
        int lastDigit = digit[digit.length - 1] - '0';
        for (int i = 0; i < digit.length - 1; i++) {
            int getCurrentDigit = digit[i] - '0';
            if (getCurrentDigit % 2 == 0) {
                index = i;
                if (getCurrentDigit < lastDigit) {
                    break;
                }
            }
        }
        if (index == -1) {
            System.out.println(index);
        } else {
            char temp = digit[index];
            digit[index] = digit[digit.length - 1];
            digit[digit.length - 1] = temp;
            for (int i = 0; i < digit.length; i++) {
                System.out.print(digit[i]);
            }
            System.out.println();
        }
    }
}