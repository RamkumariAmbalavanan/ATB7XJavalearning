package ex_12082024;

import java.util.Scanner;

//natural numbers in reverse order using for loop
public class Lab049 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number");
        int input = SC.nextInt();
        for(int i=input;i>=0;i--){
            System.out.println(i);
        }
    }
}
