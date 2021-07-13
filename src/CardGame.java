/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 13:24
 *   File: CardGame.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/106/A
 * */

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tramp = scanner.nextLine().charAt(0);
        String[] twoCards = scanner.nextLine().trim().split(" ");
        String player1 = twoCards[0];
        String player2 = twoCards[1];
        boolean tramp1 = checkTramp(tramp, player1);
        boolean tramp2 = checkTramp(tramp, player2);
        if (tramp1 && !tramp2) {
            System.out.println("YES");
        } else if (tramp1 && tramp2 && canBeat(player1, player2)) {
            System.out.println("YES");
        } else if (!tramp1 && !tramp2 && canBeat(player1, player2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkTramp(char trampCard, String playerCard) {
        return trampCard == playerCard.charAt(1);
    }

    private static boolean canBeat(String player1, String player2) {
        if (player1.charAt(1) != player2.charAt(1)) {
            return false;
        }
        char[] arr = {'6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
        int indexOf1 = 0, indexOf2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == player1.charAt(0)) {
                indexOf1 = i;
            }
            if (arr[i] == player2.charAt(0)) {
                indexOf2 = i;
            }
        }
        return indexOf1 > indexOf2;
    }
}