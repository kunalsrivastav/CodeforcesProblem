/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 19-02-2021
 *   Time: 23:47
 *   File: BeautifulMatrix.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/263/A
 * */

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int iPosition = 0, jPosition = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = sc.nextInt();
                matrix[i][j] = num;
                if (num == 1) {
                    iPosition = i;
                    jPosition = j;
                }
            }
        }
        int countSteps = Math.abs(iPosition - 2) + Math.abs(jPosition - 2);
        System.out.println(countSteps);
    }
}