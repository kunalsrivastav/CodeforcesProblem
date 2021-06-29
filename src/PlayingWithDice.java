/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 29-06-2021
 *   Time: 19:16
 *   File: PlayingWithDice.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/378/A
 * */

public class PlayingWithDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int firstPlayerWins = 0, secondPlayerWins = 0, gameEndsWithDraw = 0;
        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) < Math.abs(b - i)) {
                firstPlayerWins++;
            } else if (Math.abs(a - i) > Math.abs(b - i)) {
                secondPlayerWins++;
            } else {
                gameEndsWithDraw++;
            }
        }
        System.out.println(firstPlayerWins + " " + gameEndsWithDraw + " " + secondPlayerWins);
    }
}