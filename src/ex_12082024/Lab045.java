package ex_12082024;

import java.util.Scanner;

//print sum of all odd numbers between 1 to n using for loop
public class Lab045 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the input");
        int input=SC.nextInt();
        int sum=0;
        for(int i=0;i<=input;i++){
            if(i%2!=0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("Sum->"+sum);
    }
}
