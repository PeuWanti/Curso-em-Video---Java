import  java.util.*;

public class PrimaryTypes {
    static void main(String[] args) {
        // this is a single's line comment

        /*
            this one handles multiple lines of comment
            :)
            :(
         */
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o nome");
            String nome = input.nextLine();
            System.out.print("Digite o número");
            int num = input.nextInt();
            float pi = 3.14f;


        System.out.printf("Vou te explicar %s, a soma do nosso inteiro + pi é igual a: %.2f", nome, num + pi);
    }
}