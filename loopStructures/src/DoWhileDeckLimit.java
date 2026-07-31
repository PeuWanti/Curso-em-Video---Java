public class DoWhileDeckLimit{

    static void main(String[] args) {
        int n = 1;
        do {
            if (n < 60) {
                System.out.printf("Você ainda pode colocar %d cartas no seu deck\n", (60 - n));
            }
            else {
                System.out.print("Limite de cartas atingido\n");
            }
            n++;
        }while (n <= 60);

        System.out.println("É hora do duelo!!");
    }
}

