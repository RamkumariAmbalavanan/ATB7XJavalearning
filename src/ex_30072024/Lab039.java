package ex_30072024;

import java.util.Scanner;

public class Lab039 {


        public static void main(String[] args) {
            //System.out.println("Program to check whether a given character is uppercase or lowercase");
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter the value");
            String value = SC.nextLine();
            if (value.equals(value.toLowerCase())) {
                System.out.println("Value is lowercase");
            } else if (value.equals(value.toUpperCase())) {
                System.out.println("Value is Upper case");
            } else {
                System.out.println("Value is combination of upper and lower case");
            }
        }



}
