/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 07-07-2021
 *   Time: 11:41
 *   File: GuessANumber.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/416/A
 * */

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        int num = 0;
        int l = Integer.MIN_VALUE, r = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String[] query = arr[i].split(" ");
            if (query[0].equals(">=")) {
                if (query[2].equals("Y")) {
                    l = Math.max(Integer.parseInt(query[1]), l);
                } else if (query[2].equals("N")) {
                    r = Math.min(Integer.parseInt(query[1]) - 1, r);
                }
            }
            else if (query[0].equals(">")) {
                if (query[2].equals("Y")) {
                    l = Math.max(Integer.parseInt(query[1]) + 1, l);
                } else if (query[2].equals("N")) {
                    r = Math.min(Integer.parseInt(query[1]), r);
                }
            }
            else if (query[0].equals("<=")) {
                if (query[2].equals("Y")) {
                    r = Math.min(r, Integer.parseInt(query[1]));
                } else if (query[2].equals("N")) {
                    l = Math.max(l, Integer.parseInt(query[1]) + 1);
                }
            }
            else if (query[0].equals("<")) {
                if (query[2].equals("Y")) {
                    r = Math.min(r, Integer.parseInt(query[1]) - 1);
                } else if (query[2].equals("N")) {
                    l = Math.max(l, Integer.parseInt(query[1]));
                }
            }
        }
        if (l <= r) {
            if (r < 0 || l == Integer.MIN_VALUE) {
                System.out.println(r);
            } else {
                System.out.println(l);
            }
        } else {
            System.out.println("Impossible");
        }
    }
}