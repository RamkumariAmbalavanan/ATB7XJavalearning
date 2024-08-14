package ex_13082024;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {
        String [] names=new String[5];
        System.out.println("Enter 5 names");
        for(int i=0;i<names.length;i++){
            Scanner SC=new Scanner(System.in);
            names[i]=SC.nextLine();
        }
        for(int i=0;i<names.length;i++){
            System.out.println("name->"+(i+1)+names[i]);
        }
    }
}
