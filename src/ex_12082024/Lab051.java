package ex_12082024;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number");
        int input = SC.nextInt();
        for(int i=input;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
