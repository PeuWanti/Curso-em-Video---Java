import java.util.Scanner;
public class TelemartkingCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;

        System.out.println("-----Central de atendimento-----");
        System.out.print(" 1 - Financeiro\n 2 - Confira nossos planos\n 3 - Assistencia\n 4 - Atendimento Humano\n ");
        opt = input.nextInt();
        switch (opt) {
            case 1:
                System.out.print("Você está no setor Financeiro");
                break;
            case 2:
                System.out.print("Você está no setor Comercial");
                break;
            case 3:
                System.out.print("Você está no setor de Reclamação");
                break;
            case 4:
                System.out.print("Você está no setor de Atendimento humano");
                break;
                default:
                    System.out.println("Especifique sua escolha");
        }

    }
}
