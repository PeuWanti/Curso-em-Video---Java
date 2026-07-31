import java.util.Scanner;

public class EvenOrOdd {
    static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers between 1 and 10: ");
         n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("it's even");
        } else  {
            System.out.println("it's odd");
        }
    }
}
