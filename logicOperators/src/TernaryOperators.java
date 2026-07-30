public class TernaryOperators {
    public static void main(String[] args) {

        int n1 = 1, n2 = 2, n3;

        n3 = n1 > n2 ? 0 : ++n2; //always false

        System.out.printf(Integer.toString(n3));
    }
}