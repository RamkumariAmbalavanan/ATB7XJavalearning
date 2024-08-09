package ex_30072024;
//Difference between isEmpty and isBlank
public class Lab033 {
    public static void main(String[] args) {
        String name="Kumari";
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        String A="";
        System.out.println(A.isEmpty());
        System.out.println(A.isBlank());
        String B=" ";
        System.out.println(B.isEmpty());
        System.out.println(B.isBlank());
    }
}
