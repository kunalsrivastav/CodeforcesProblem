/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 20-07-2021
 *   Time: 23:12
 *   File: InnaAndAlarmClock.java
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/390/A
 * */

public class InnaAndAlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xCoordinate = new int[n];
        int[] yCoordinate = new int[n];
        for (int i = 0; i < n; i++) {
            xCoordinate[i] = scanner.nextInt();
            yCoordinate[i] = scanner.nextInt();
        }
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> column = new HashSet<>();
        for (int i = 0; i < n; i++) {
            row.add(xCoordinate[i]);
            column.add(yCoordinate[i]);
        }
        System.out.println(Math.min(row.size(), column.size()));
    }
}