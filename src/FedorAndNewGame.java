/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 22-07-2021
 *   Time: 00:09
 *   File: FedorAndNewGame.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/467/B
 * */

public class FedorAndNewGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[m + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        String fedorsBinary = Integer.toBinaryString(arr[m]);
        for (int i = 0; i < 20 - fedorsBinary.length(); i++) {
            sb.append(0);
        }
        sb.append(fedorsBinary);
        int count = 0;
        for (int i = 0; i < m; i++) {
            StringBuilder otherPlayer = new StringBuilder();
            String otherBinary = Integer.toBinaryString(arr[i]);
            for (int j = 0; j < 20 - otherBinary.length(); j++) {
                otherPlayer.append(0);
            }
            otherPlayer.append(otherBinary);
            int differentBits = 0;
            for (int j = 0; j < 20; j++) {
                if (sb.charAt(j) != otherPlayer.charAt(j)) {
                    differentBits++;
                }
            }
            if (differentBits <= k) {
                count++;
            }
        }
        System.out.println(count);
    }
}