/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 18-02-2021
 *   Time: 23:19
 *   File: WayTooLongWords.java
 */

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (s.length() <= 10) {
                System.out.println(s);
            }
            else {
                System.out.println(s.charAt(0)  + "" + (s.length() - 2) + "" + s.charAt(s.length() - 1));
            }
        }
        sc.close();
    }
}