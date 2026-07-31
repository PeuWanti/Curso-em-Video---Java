import java.util.Scanner;

public class MonthsVector {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String months[] = {"jan","fev","mar","abr","mai","jun","jul",
                "ago","set","out","nov","dez"};

        int days[] = {30,28,31,30,31,30,31,30,31,31,30,31};

        System.out.println("Em que ano estamos?");
        int year = input.nextInt();

        if (year%4==0){
            days[1] = 29;
        }
        for (int c = 0; c < months.length; c++){
            System.out.printf("O mês de %s tem %d dias ao todo\n", months[c], days[c]);
        }
    }
}
