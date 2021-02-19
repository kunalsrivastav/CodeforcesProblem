/*   Created by IntelliJ IDEA.
*   Author: Kunal Srivastav (kunalsrivastav)
*   Date: 19-02-2021
*   Time: 23:53
*   File: YoungPhysicist.java
*/

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sumOfX = 0, sumOfY = 0, sumOfZ = 0;
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sumOfX += x;
            sumOfY += y;
            sumOfZ += z;
        }
        if (sumOfX == 0 && sumOfY == 0 && sumOfZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}