package ex_30072024;

import java.util.Objects;
import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the name1");
        String name1 = SC.nextLine();
        //System.out.println(name1);

        Scanner SC1=new Scanner(System.in);
        System.out.println("Enter the name2");
        String name2 = SC.nextLine();
        //System.out.println(name2);
        if(Objects.equals(name1, name2)){
            System.out.println("Content is equal");
        }else{
            System.out.println("Content not equal");
        }
    }
}
