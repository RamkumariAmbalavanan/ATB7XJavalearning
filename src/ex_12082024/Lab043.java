package ex_12082024;
//all even numbers between 1 to 100 using for loop.
public class Lab043 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("It is an even number->"+i);
            }
            else{
                System.out.println("It is a odd number->"+i);
            }
        }
    }
}
