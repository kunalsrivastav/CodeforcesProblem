/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 22-05-2021
 *   Time: 21:00
 *   File: TeamOlympiad.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/490/A
 * */

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            } else {
                count3++;
            }
        }
        int minPossibleTeam = Math.min(count1, Math.min(count2, count3));
        if (minPossibleTeam == 0) {
            System.out.println(0);
        } else {
            ArrayList<Integer> index1 = new ArrayList<>();
            ArrayList<Integer> index2 = new ArrayList<>();
            ArrayList<Integer> index3 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    index1.add(i+1);
                } else if (arr[i] == 2) {
                    index2.add(i+1);
                } else {
                    index3.add(i+1);
                }
            }
            System.out.println(minPossibleTeam);
            for (int i = 0; i < minPossibleTeam; i++) {
                System.out.println(index1.get(i) + " " + index2.get(i) + " " + index3.get(i));
            }
        }
    }
}