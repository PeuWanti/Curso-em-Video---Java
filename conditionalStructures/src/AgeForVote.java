import java.util.Scanner;

public class AgeForVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Por favor, informe sua idade: ");
        age = input.nextInt();

        if (age >= 16 && age <= 18 || age >= 70){
            System.out.println("Seu voto é opcional");
        } else if (age >= 18) {
            System.out.println("Você precisa votar!");
        } else {
            System.out.println("Por que você está pensando nisso?");
        }

    }
}
