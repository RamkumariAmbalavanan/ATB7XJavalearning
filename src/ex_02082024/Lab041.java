package ex_02082024;

import java.util.Scanner;

//to check whether a character is a vowel or consonant using if-else.
public class Lab041 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the input");
        char ch=SC.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Its a vowel");
        }
        else{
            System.out.println("Its a consonant");
        }
    }
}
