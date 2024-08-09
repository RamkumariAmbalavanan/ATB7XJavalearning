package ex_30072024;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        System.out.println("Enter the input1");
        float input1=SC.nextFloat();
        if(input1>5){
            System.out.println("Given value is greater");
        }else{
            System.out.println("given value is smaller");
        }
    }
}
