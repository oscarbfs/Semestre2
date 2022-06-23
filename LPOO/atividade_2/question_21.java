package LPOO.atividade_2;

public class question_21 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        String frase = scanner.scannerString("Escreva uma frase: ", "sim");

        String[] array_palavras = frase.split(" ");
        int qtede_palavras = array_palavras.length;

        System.out.println("Essa frase tem " + qtede_palavras + " palavras");
    }
}
