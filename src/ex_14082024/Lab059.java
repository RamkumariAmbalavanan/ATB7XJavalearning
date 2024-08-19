package ex_14082024;
//Avg mark
import java.util.Scanner;

public class Lab059 {
    public static void main(String[] args) {
        int[]marks=new int [5];
        float avg=0;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter 5 marks");
        for(int i=0;i< marks.length;i++){
            marks[i]=SC.nextInt();
        }
        for(int i=0;i< marks.length;i++){
            avg=avg+marks[i];
        }
        for(int i=0;i< marks.length;i++){
            System.out.println("Mark"+(i+1)+"->"+marks[i]);
        }
        System.out.println("Avg->"+avg/marks.length);
    }
}
