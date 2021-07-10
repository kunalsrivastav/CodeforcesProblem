/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 10-07-2021
 *   Time: 13:16
 *   File: Chord.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/88/A
 * */

public class Chord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] note = scanner.nextLine().trim().split(" ");
        String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "B", "H"};
        boolean major = checkMajor(note, notes);
        boolean minor = false;
        if (!major) {
            minor = checkMinor(note, notes);
        }
        if (major) {
            System.out.println("major");
        } else if (minor) {
            System.out.println("minor");
        } else {
            System.out.println("strange");
        }
    }

    private static boolean checkMajor(String[] note, String[] notes) {
        return major(note[0], note[1], note[2], notes) || major(note[0], note[2], note[1], notes) || major(note[1], note[0], note[2], notes)
                || major(note[1], note[2], note[0], notes) || major(note[2], note[0], note[1], notes) || major(note[2], note[1], note[0], notes);
    }

    private static boolean major(String a, String b, String c, String[] notes) {
        return (distance(a, b, notes) == 4 && distance(b, c, notes) == 3);
    }

    private static boolean checkMinor(String[] note, String[] notes) {
        return minor(note[0], note[1], note[2], notes) || minor(note[0], note[2], note[1], notes) || minor(note[1], note[0], note[2], notes)
                || minor(note[1], note[2], note[0], notes) || minor(note[2], note[0], note[1], notes) || minor(note[2], note[1], note[0], notes);
    }

    private static boolean minor(String a, String b, String c, String[] notes) {
        return (distance(a, b, notes) == 3 && distance(b, c, notes) == 4);
    }

    private static int distance(String a, String b, String[] notes) {
        int index = 0;
        for(int i = 0; i < notes.length; i++) {
            if (notes[i].equals(a)) {
                index = i;
                break;
            }
        }
        for(int dist = 1; ; dist++) {
            String next = notes[(index + dist) % 12];
            if(next.equals(b)) {
                return dist;
            }
        }
    }
}