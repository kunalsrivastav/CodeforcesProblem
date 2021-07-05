/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 05-07-2021
 *   Time: 21:21
 *   File: DimaAndContinuousLine.java
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Question - https://codeforces.com/problemset/problem/358/A
 * */

public class DimaAndContinuousLine {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(inp.readLine().trim());
        String[] distinctInteger = inp.readLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(distinctInteger[i]);
        }
        int x1, x2, x3, x4;
        boolean possible = false;
        for (int i = 0; i < n - 1; i++) {
            x1 = Math.min(arr[i], arr[i + 1]);
            x2 = Math.max(arr[i], arr[i + 1]);
            for (int j = 0; j < n - 1; j++) {
                x3 = Math.min(arr[j], arr[j + 1]);
                x4 = Math.max(arr[j], arr[j + 1]);
                if ((x1 < x3 && x3 < x2 && x2 < x4) || (x3 < x1 && x1 < x4 && x4 < x2)) {
                    possible = true;
                    break;
                }
            }
        }
        out.write(possible ? "yes" : "no");
        out.flush();
    }
}