/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-02-2021
 *   Time: 23:47
 *   File: Presents.java
 */

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        int[] newArray = new int[num];
        for (int i = 0; i < num; i++) {
            newArray[array[i] - 1] = i + 1;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}