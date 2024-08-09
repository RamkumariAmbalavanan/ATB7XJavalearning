package ex_30072024;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {
        System.out.println("program to check whether input is digit or not");
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the value");
        char value=SC.next().charAt(0);
        //char A='5A';
        System.out.println(value);
        if(value>='0' && value<='9'){
            System.out.println("The value is a digit");
        }else{
            System.out.println("The value is not a digit");
        }


    }
}
