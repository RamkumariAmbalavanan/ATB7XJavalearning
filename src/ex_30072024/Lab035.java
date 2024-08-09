package ex_30072024;
//print maximum among three numbers using if-else.

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number1");
        float num1=SC.nextFloat();

        Scanner SC1 = new Scanner(System.in);
        System.out.println("Enter number2");
        float num2=SC1.nextFloat();

        Scanner SC3 = new Scanner(System.in);
        System.out.println("Enter number3");
        float num3=SC3.nextFloat();

        if(num1>num2){
            System.out.println(num1+" is Max");
        }else if(num2>num3)
            System.out.println(num2+" is Max" );
        else
        System.out.println(num3+" is Max" );

    }
}
