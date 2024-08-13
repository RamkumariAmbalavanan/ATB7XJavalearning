package ex_12082024;

import java.util.Scanner;

//print the sum of digits of a given number
public class Lab048 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the input");
        int input=SC.nextInt();
        int sum_of_digit=0;
        if(input==0){
            sum_of_digit=0;
            //System.out.println("Sum of digits->"+sum_of_digit);
        }
        while(input!=0){
            int remainder=input%10;//remainder=1
            //input - 111
            input=input/10;//input=
            sum_of_digit=sum_of_digit+remainder;
            //System.out.println("Sum of digits->"+sum_of_digit);

        }
        System.out.println("Sum of digits->"+sum_of_digit);
    }
}
