package ex_14082024;

import java.util.Scanner;

//Maximium and minimum salary
public class Lab060 {
    public static void main(String[] args) {
        int salary[]=new int[5];
        int max=1;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the salary");
        for(int i=0;i< salary.length;i++){
            salary[i]= SC.nextInt();
        }
        for(int i=0;i< salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
        }
        System.out.println("Max salary->"+max);
        int min=salary[0];
        for(int i=1;i< salary.length;i++){
            if(salary[i]<salary[0]){
                min=salary[i];
            }
        }
        System.out.println("Min salary->"+min);

    }
}
