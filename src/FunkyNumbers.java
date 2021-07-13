/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 20:09
 *   File: FunkyNumbers.java
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Question - https://codeforces.com/problemset/problem/192/A
 * */

public class FunkyNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(inp.readLine().trim());
        boolean found = false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; (i * (i + 1)) / 2 <= n; i++) {
            arrayList.add((i * (i + 1)) / 2);
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            int val = n - arrayList.get(i);
            if (Collections.binarySearch(arrayList, val) >= 0) {
                found = true;
                break;
            }
        }
        out.write(found ? "YES" : "NO");
        out.flush();
    }
}