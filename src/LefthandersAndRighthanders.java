/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-07-2021
 *   Time: 21:12
 *   File: LefthandersAndRighthanders.java
 */

import java.io.*;

/**
 * Question - https://codeforces.com/problemset/problem/234/A
 * */

public class LefthandersAndRighthanders {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        int n = Integer.parseInt(inp.readLine().trim());
        String s = inp.readLine();
        int mid = n / 2;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(mid) == 'L' && s.charAt(i) == 'R') {
                out.println((mid + 1) + " " + (i + 1));
            } else {
                out.println((i + 1) + " " + (mid + 1));
            }
            mid++;
        }
        out.close();
    }
}