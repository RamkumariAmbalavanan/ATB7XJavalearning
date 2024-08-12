package ex_09082024;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        System.out.println("------Factorial program-------");
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = SC.nextInt();
        int fact=1;
        for(int i=1;i<=input;i++){
            fact=fact*i;

        }
        System.out.println(fact);



    }
}
