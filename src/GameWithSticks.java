/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 27-02-2021
 *   Time: 00:12
 *   File: GameWithSticks.java
 */

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int min = Math.min(n, m);
        if (min % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}