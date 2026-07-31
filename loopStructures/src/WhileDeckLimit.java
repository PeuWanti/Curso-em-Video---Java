import java.util.Arrays;

public class WhileDeckLimit {

    static void main(String[] args) {
        int n = 1;
        while (n <= 60){
            if (n < 60) {
                System.out.printf("Você ainda pode colocar %d cartas no seu deck\n", (60 - n));
            }
            else {
                System.out.print("Limite de cartas atingido\n");
            }
            n++;
        }
        System.out.println("É hora do duelo!!");
    }
}
