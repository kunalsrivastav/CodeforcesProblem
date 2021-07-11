/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 11-07-2021
 *   Time: 11:53
 *   File: PalindromicTimes.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/108/A
 * */

public class PalindromicTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int hour = Integer.parseInt(s.trim().split(":")[0]);
        int minute = Integer.parseInt(s.trim().split(":")[1]);
        String[] palindromicTime = {"00:00", "01:10", "02:20", "03:30", "04:40", "05:50", "10:01", "11:11", "12:21", "13:31", "14:41", "15:51",
                                        "20:02", "21:12", "22:22", "23:32"};
        for (int i = 0; i < palindromicTime.length; i++) {
            int pHour = Integer.parseInt(palindromicTime[i].split(":")[0]);
            int pMinute = Integer.parseInt(palindromicTime[i].split(":")[1]);
            if ((hour < pHour) || (hour == pHour && minute < pMinute)) {
                System.out.println(palindromicTime[i]);
                break;
            }
            if (hour == 23 && minute > 32) {
                System.out.println(palindromicTime[0]);
                break;
            }
        }
    }
}