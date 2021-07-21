/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-07-2021
 *   Time: 21:20
 *   File: ShellGame.java
 */

import java.io.*;

/**
 * Question - https://codeforces.com/problemset/problem/35/A
 * */

public class ShellGame {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        int index = Integer.parseInt(inp.readLine().trim());
        for (int i = 0; i < 3; i++) {
            String[] shuffle = inp.readLine().trim().split(" ");
            if (index == Integer.parseInt(shuffle[0])) {
                index = Integer.parseInt(shuffle[1]);
            } else if (index == Integer.parseInt(shuffle[1])) {
                index = Integer.parseInt(shuffle[0]);
            }
        }
        out.println(index);
        out.close();
    }
}