package ex_13082024;

import java.util.Scanner;

public class Lab054 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the 3 inputs");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = SC.nextInt();
            //System.out.println("Input"+i+"->"+marks[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            // marks[i]=SC.nextInt();
            System.out.println("Input" + (i+1) + "->" + marks[i]);

        }
    }
}