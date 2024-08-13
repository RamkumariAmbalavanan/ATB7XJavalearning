package ex_12082024;

import java.util.Scanner;
//Multiplication of n numbers
public class Lab046 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the input");
        int input=SC.nextInt();
        int mul=1;
        for(int i=1;i<=input;i++){
            mul=mul*i;
        }
        System.out.println("Mul->"+mul);
    }
}
