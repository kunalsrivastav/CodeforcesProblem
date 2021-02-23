/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-02-2021
 *   Time: 23:35
 *   File: LuckyDivision.java
 */

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 4 == 0 || number % 7 == 0 || number % 47 == 0 || number % 74 == 0 ||
                number % 447 == 0 || number % 474 == 0 || number % 477 == 0 ||
                number % 774 == 0 || number % 747 == 0 || number % 744 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}