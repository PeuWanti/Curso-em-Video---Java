import java.util.Locale;
import java.util.Scanner;

public class MediaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        float num1, num2;
        float media;

        System.out.println("Escreva o primeiro número:");
        num1 = input.nextFloat();
        System.out.println("Escreva o segundo número:");
        num2 = input.nextFloat();
        media = (num1+num2)/2f;

        if(media>6 && media<=10){
            System.out.print("Parabéns, pequeno Gafanhoto");
        } else {
        System.out.print("U still gotta ways to go");
        }
    }
}