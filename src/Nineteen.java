/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 20-07-2021
 *   Time: 22:44
 *   File: Nineteen.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/393/A
 * */

public class Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int countN = 0, countI = 0, countE = 0, countT = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                countI++;
            } else if (s.charAt(i) == 'n') {
                countN++;
            } else if (s.charAt(i) == 'e') {
                countE++;
            } else if (s.charAt(i) == 't') {
                countT++;
            }
        }
        countE = countE / 3;
        if (countN <= 4) {
            countN /= 3;
        } else {
            countN = (countN - 1) / 2;
        }
        System.out.println(Math.min(countN, Math.min(countE, Math.min(countI, countT))));
    }
}