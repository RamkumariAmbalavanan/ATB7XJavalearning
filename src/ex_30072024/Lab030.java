package ex_30072024;

import java.util.Scanner;

public class Lab030 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the input1");
        int input1=SC.nextInt();
        System.out.println(input1);

        Scanner SC1=new Scanner(System.in);
        System.out.println("Enter the input2");
        int input2=SC.nextInt();
        System.out.println(input2);

        if(input1==input2){
            System.out.println("Both values are equal");
        }else{
            System.out.println("Both inputs are not equal");
        }

    }
}
