package ex_30072024;

import java.util.Scanner;

//whether a given number is even or odd using if-else.
public class Lab037 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the num");
        float num=SC.nextFloat();
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
