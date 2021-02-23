/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-02-2021
 *   Time: 22:31
 *   File: ChatRoom.java
 */

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine());
        if (s.length() < 5) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 'h' && s.charAt(i) != 'e' && s.charAt(i) != 'l' && s.charAt(i) != 'o') {
                    s.deleteCharAt(i);
                }
            }
            String strHello = "hello";
            int newIndex = 0;
            for (int i = 0; i < s.length(); i++) {
                if (strHello.charAt(newIndex) == s.charAt(i)) {
                    newIndex++;
                }
                if (newIndex == strHello.length()) {
                    break;
                }
            }
            if (newIndex == strHello.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}