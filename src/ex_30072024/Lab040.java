package ex_30072024;

import java.util.Scanner;

//to print number of days for a given input month using if-else.
public class Lab040 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the month in full name eg:'January'");
        String month=SC.nextLine();
        if(month.equals("January") ||month.equals("March")||month.equals("May")||month.equals("July")||month.equals("August")||month.equals("October")||month.equals("December")){
            System.out.println(month+" have 31 days");
        } else if (month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November")) {
            System.out.println(month+" have 30 days");
        } else if (month.equals("February")) {
            System.out.println(month+" have 28 or 29 days");
        }else {
            System.out.println("Enter in the correct format");
        }
    }
}
