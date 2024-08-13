package ex_12082024;
//count the digits of a given number
import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the input");
        int input = SC.nextInt();
        int count=0;
        if(input==0){
            System.out.println("digit_Count->"+1);
        }
        while(input!=0){
            input=input/10;
            count=count+1;
            System.out.println("digit_Count->"+count);
        }



    }
}
