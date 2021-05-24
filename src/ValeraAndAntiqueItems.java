/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 24-05-2021
 *   Time: 19:43
 *   File: ValeraAndAntiqueItems.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/441/A
 * */

public class ValeraAndAntiqueItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numOfItems = scanner.nextInt();
            boolean doneWithThis = false;
            for (int j = 0; j < numOfItems; j++) {
                int priceOfItem = scanner.nextInt();
                if (v > priceOfItem && !doneWithThis) {
                    arrayList.add(i+1);
                    doneWithThis = true;
                }
            }
        }
        if (arrayList.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();
        }
    }
}