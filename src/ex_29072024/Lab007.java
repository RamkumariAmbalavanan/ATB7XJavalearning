package ex_29072024;
// Difference between SCP and Heap and == and .equals
public class Lab007 {
    public static void main(String[] args) {
        //SCP
        String name="Kumari";
        String name1="Kumari";
        System.out.println(name == name1);//== always compare the reference variable
        System.out.println(name.equals(name1));
        //Heap
        String name2=new String("Ram");
        String name3=new String("Ram");
        System.out.println(name2 == name3);//== always compare the reference variable
        System.out.println(name2.equals(name3));

    }
}
