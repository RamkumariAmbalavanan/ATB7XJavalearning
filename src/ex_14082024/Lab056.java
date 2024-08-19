package ex_14082024;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {
        int[]number=new int[5];
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the 5 input");
        for(int i=0;i<number.length;i++)
        {
            number[i]=SC.nextInt();

        }
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]*2);
        }

    }
}
