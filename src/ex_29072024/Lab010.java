package ex_29072024;

public class Lab010 {
    public static void main(String[] args) {
        String name="Meghna";
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(name.compareToIgnoreCase("MEGHna"));
        System.out.println(name.equalsIgnoreCase("MEGHNA"));

    }
}
