/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 23:18
 *   File: StrangeAddition.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/305/A
 * */

public class StrangeAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
        int one = 0, ten = 0, hundred = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) {
                arrayList.add(0);
            } else if (arr[i] == 100 && hundred == 0) {
                arrayList.add(arr[i]);
                hundred = 1;
            } else if (arr[i] > 0 && arr[i] < 10 && one == 0) {
                arrayList.add(arr[i]);
                one = 1;
            } else if (arr[i] > 9 && arr[i] < 100 && arr[i] % 10 == 0 && ten == 0) {
                arrayList.add(arr[i]);
                ten = 1;
            }
        }
        if (one == 0 && ten == 0) {
            for (int i = 0; i < k; i++) {
                if (arr[i] < 100 && arr[i] > 9) {
                    arrayList.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(arrayList.size());
        for (Integer element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}