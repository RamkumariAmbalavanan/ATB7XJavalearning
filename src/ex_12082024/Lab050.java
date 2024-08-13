package ex_12082024;
//Print right angle triangle
import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number");
        int input = SC.nextInt();
        for(int i=0;i<input;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
