/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 15-07-2021
 *   Time: 12:51
 *   File: PointOnSpiral.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/279/A
 * */

public class PointOnSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x == 0 && y == 0) || (x == 1 && y == 0)) {
            System.out.println(0);
        } else {
            int initialX = 0, initialY = 0;
            int steps = 0;
            int i = 1;
            int turn = 0;
            int prevX = 0, prevY = 0;
            boolean right = true, up = true, left = true, down = true;
            while (true) {
                prevX = initialX;
                prevY = initialY;
                if (right) {
                    right = false;
                    initialX += i;
                } else if (up) {
                    up = false;
                    initialY += i;
                } else if (left) {
                    left = false;
                    initialX -= i;
                } else if (down) {
                    down = false;
                    initialY -= i;
                }
                turn++;
                if (!right && !up && !left && !down) {
                    right = true;
                    up = true;
                    left = true;
                    down = true;
                }
                if (turn % 2 == 0) {
                    i++;
                }
                if (y == initialY && ((x >= initialX && x <= prevX) || (x >= prevX && x <= initialX))) {
                    break;
                }
                if (x == initialX && ((y >= initialY && y <= prevY) || (y >= prevY && y <= initialY))) {
                    break;
                }
                steps++;
            }
            System.out.println(steps);
        }
    }
}