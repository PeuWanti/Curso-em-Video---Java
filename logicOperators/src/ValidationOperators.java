public class ValidationOperators {
    public static void main(String[] args) {
        String nome1 = "Gustavo", nome2 = "Gustavo";
        String nome3 = new String("Gustavo");

        System.out.println(Boolean.toString(nome1 == nome2));
        System.out.println(Boolean.toString(nome1 == nome3));
        System.out.println(Boolean.toString(nome1.equals(nome3)));

        /*  == compares the variable type
            equals() compares only the content
        */
    }

}
