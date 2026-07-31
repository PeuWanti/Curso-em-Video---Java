import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número que deseja multiplicar: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
    }
}
