package ex_13082024;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // index - 0,1,2
        // len - 3
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark1,mark2,mark3");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        System.out.println(marks[10]); // AIOBE

    }
}
