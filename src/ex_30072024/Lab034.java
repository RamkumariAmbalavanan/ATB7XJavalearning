package ex_30072024;

import java.util.Scanner;

//print maximum among two numbers using if-else.
public class Lab034 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number1");
        float num1=SC.nextFloat();

        Scanner SC1 = new Scanner(System.in);
        System.out.println("Enter number2");
        float num2=SC1.nextFloat();

        if(num1>num2){
            System.out.println(num1+" is Max");
        }else{
            System.out.println(num2+" is Max" );
        }

    }
}
