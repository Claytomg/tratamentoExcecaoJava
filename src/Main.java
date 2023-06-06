// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            diminuirLetras ltpqn = new diminuirLetras();
            diminuirLetras.lowCase();
        } catch (NullPointerException e) {
            System.out.println("Excessao nullPointerExcepton identificada");
            System.out.format("Método diminui letras tratado\n" + e);
        }
    }
}