import  java.math.*;
import  java.util.*;
public class MathOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int n1 = input.nextInt();

        System.out.println("Please enter a number: ");
        int n2 = input.nextInt();
        float m = (n1 + n2) / 2f;
        int ma = Math.round(m);

        System.out.printf("A media dos números é %.1f", m);
        System.out.printf("\nA media aredondada é %d",ma);

        //Existem muitas outras operações com os metódos de Math
    }
}
