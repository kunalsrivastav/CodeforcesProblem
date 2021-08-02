/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 02-08-2021
 *   Time: 21:07
 *   File: PhoneNumbers.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/151/B
 * */

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> taxi = new ArrayList<>();
        ArrayList<String> pizza = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();
        int taxiNumber = 0, pizzaNumber = 0, girlNumber = 0;
        scanner.nextLine();
        while (n-- > 0) {
            String[] numberAndName = scanner.nextLine().trim().split(" ");
            int s = Integer.parseInt(numberAndName[0]);
            String name = numberAndName[1];
            String[] arr = new String[s];
            for (int i = 0; i < s; i++) {
                arr[i] = scanner.nextLine();
            }
            int countTaxi = 0, countPizza = 0, countGirl = 0;
            for (String value : arr) {
                boolean allEqual = false, decreasing = false;
                StringBuilder contacts = new StringBuilder(value.substring(0, 2) + "" + value.substring(3, 5) + "" + value.substring(6, value.length()));
                for (int j = 0; j < contacts.length() - 1; j++) {

                    if (contacts.charAt(j) == contacts.charAt(j + 1) && !decreasing) {
                        allEqual = true;
                    } else if (!allEqual && Character.getNumericValue(contacts.charAt(j)) > Character.getNumericValue(contacts.charAt(j + 1))) {
                        decreasing = true;
                    } else {
                        allEqual = false;
                        decreasing = false;
                        break;
                    }
                }
                if (allEqual) {
                    countTaxi++;
                } else if (decreasing) {
                    countPizza++;
                } else {
                    countGirl++;
                }
            }
            if (countTaxi > taxiNumber) {
                taxiNumber = countTaxi;
                taxi.clear();
                taxi.add(name);
            } else if (countTaxi == taxiNumber) {
                taxi.add(name);
            }
            if (countPizza > pizzaNumber) {
                pizzaNumber = countPizza;
                pizza.clear();
                pizza.add(name);
            } else if (countPizza == pizzaNumber) {
                pizza.add(name);
            }
            if (countGirl > girlNumber) {
                girlNumber = countGirl;
                girl.clear();
                girl.add(name);
            } else if (countGirl == girlNumber) {
                girl.add(name);
            }
        }
        System.out.print("If you want to call a taxi, you should call: ");
        for (int i = 0; i < taxi.size(); i++) {
            System.out.print(taxi.get(i) + ((i != taxi.size() - 1) ? ", " : ""));
        }
        System.out.println(".");
        System.out.print( "If you want to order a pizza, you should call: ");
        for (int i = 0; i < pizza.size(); i++) {
            System.out.print(pizza.get(i) + ((i != pizza.size() - 1) ? ", " : ""));
        }
        System.out.println(".");
        System.out.print( "If you want to go to a cafe with a wonderful girl, you should call: ");
        for (int i = 0; i < girl.size(); i++) {
            System.out.print(girl.get(i) + ((i != girl.size() - 1) ? ", " : ""));
        }
        System.out.println(".");
    }
}