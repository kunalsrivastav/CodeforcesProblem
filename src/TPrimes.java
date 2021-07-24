/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 24-07-2021
 *   Time: 19:38
 *   File: TPrimes.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/230/B
 * */

public class TPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        boolean[] sieve = new boolean[1000001];
        generateSieve(sieve);
        for (int i = 0; i < n; i++) {
            long sqrt = (long)Math.sqrt(arr[i]);
            if((sieve[(int)sqrt]) && (sqrt * sqrt == arr[i]) && (arr[i] != 1)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    private static void generateSieve(boolean[] sieve){
        Arrays.fill(sieve,true);
        for(int i=2; i * i < 1000001; i++){
            if(sieve[i]){
                for(int j = i * i; j < 1000001; j += i){
                    sieve[j] = false;
                }
            }
        }
    }
}