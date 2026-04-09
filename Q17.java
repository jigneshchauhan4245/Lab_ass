import pack17.*;

public class Q17 {
    public static void main(String[] args) {

        Temperature t = new Temperature();

        System.out.println("---- Celsius to Fahrenheit ----");
        t.convert(25);

        System.out.println("\n---- Fahrenheit to Celsius ----");
        t.convert(77, 1);

        System.out.println("\n---- Invalid Case ----");
        t.convert(-500);
    }
}