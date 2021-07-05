/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 05-07-2021
 *   Time: 20:51
 *   File: EugenyAndArray.java
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Question - https://codeforces.com/problemset/problem/302/A
 * */

public class EugenyAndArray {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] nm = inp.readLine().trim().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] strArr = inp.readLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int[] lArr = new int[m];
        int[] rArr = new int[m];
        for (int i = 0; i < m; i++) {
            String[] lr = inp.readLine().trim().split(" ");
            lArr[i] = Integer.parseInt(lr[0]);
            rArr[i] = Integer.parseInt(lr[1]);
        }
        int countPositiveOne = 0, countNegativeOne = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                countPositiveOne++;
            } else if (arr[i] == -1) {
                countNegativeOne++;
            }
        }
        for (int i = 0; i < m; i++) {
            int diff = rArr[i] - lArr[i] + 1;
            if (diff % 2 == 0 && ((diff / 2) <= countPositiveOne) && ((diff / 2) <= countNegativeOne)) {
                out.write(1 + "\n");
            } else {
                out.write(0 + "\n");
            }
        }
        out.flush();
    }
}