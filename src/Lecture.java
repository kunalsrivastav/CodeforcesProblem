/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-08-2021
 *   Time: 23:24
 *   File: Lecture.java
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/499/B
 * */

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] keyValue = scanner.nextLine().trim().split(" ");
            map.put(keyValue[0], keyValue[1]);
        }
        String[] lectureText = scanner.nextLine().trim().split(" ");
        StringBuilder notes = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (lectureText[i].length() <= map.get(lectureText[i]).length()) {
                notes.append(lectureText[i]).append(" ");
            } else {
                notes.append(map.get(lectureText[i])).append(" ");
            }
        }
        System.out.println(notes);
    }
}