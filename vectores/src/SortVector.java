import java.lang.reflect.Array;
import java.util.Arrays;

public class SortVector {
    public static void main(String[] args) {
        double vector[] = {1,0.5,-10.18,4567,-110,6167};

        Arrays.sort(vector);

        for (double n:vector){
            System.out.printf("%.1f\n",n);
        }

        double menor = Arrays.stream(vector).min().getAsDouble();
        double maior = Arrays.stream(vector).max().getAsDouble();
        System.out.printf("\nO menor valor é: %.1f\n",menor);
        System.out.printf("O maior valor é: %.1f\n",maior);
    }
}
