package ex_29072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab020 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input=SC.nextInt();
        System.out.println(user_input);
        if(user_input>10){
            System.out.println("Number is greater than 10");
        }else{
            System.out.println("Number is equal to or lesser than 10");
        }
    }
}
