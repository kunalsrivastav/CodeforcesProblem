/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 23:17
 *   File: IlyaAndBankAccount.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/313/A
 * */

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 0) {
            System.out.println(num);
        } else {
            num = -num;
            if (num <= 10) {
                System.out.println(0);
            } else {
                String s = String.valueOf(num);
                int last1 = Character.getNumericValue(s.charAt(s.length() - 1));
                int last2 = Character.getNumericValue(s.charAt(s.length() - 2));
                StringBuilder sb = new StringBuilder(0 + "");
                for (int i = 0; i < s.length() - 2; i++) {
                    sb.append(s.charAt(i));
                }
                int newNum = Integer.parseInt(sb.toString());
                int num1 = newNum * 10 + last1;
                int num2 = newNum * 10 + last2;
                int min = Math.min(num1, num2);
                System.out.println(min != 0 ? "-" + min : min);
            }
        }
    }
}