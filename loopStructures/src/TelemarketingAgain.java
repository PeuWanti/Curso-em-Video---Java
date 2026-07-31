import java.util.Scanner;

public class TelemarketingAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String itsSolved;
        String problem;
        do {
            System.out.println("Seja bem-vindo!");
            System.out.println("Você está com algum problema?");
            itsSolved = input.nextLine();
            if (itsSolved.equals("Sim")) {
                System.out.print("Como podemos ajudar?");
                problem = input.nextLine();
                System.out.println("Vamos retornar brevemente!");
            }
        } while(itsSolved.equals("Sim"));

        System.out.print("Ficamos felizes em ajudar!");
    }
}
