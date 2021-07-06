/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 15:01
 *   File: Football.java
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/43/A
 * */

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], 1);
            }
        }
        String teamName = s[0];
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                teamName = entry.getKey();
            }
        }
        System.out.println(teamName);
    }
}