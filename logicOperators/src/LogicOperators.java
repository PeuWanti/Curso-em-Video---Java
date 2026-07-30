import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite = 12, idade;

        System.out.printf("Insira sua idade:");
        idade = input.nextInt();

        String resp = idade <= limite && idade >= 7 ? "Venha escudeirinho S2" : "Não pode iniciar";

        System.out.printf(resp);
    }
}
