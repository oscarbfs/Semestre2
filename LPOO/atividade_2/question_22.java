package LPOO.atividade_2;

public class question_22 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        String frase = scanner.scannerString("Escreva uma frase: ", "sim");

        String[] array_palavras = frase.split(" ");
        int tamanho = array_palavras.length;
        String fraseInvertida = "";

        // assim mano aki q esta a logica ..
        for ( int i =  tamanho - 1 ; i >= 0 ; i-- ) {

        fraseInvertida = fraseInvertida + array_palavras[i] + " ";

        }

        System.out.println("Essa frase invertiva é: " + fraseInvertida);
    }
}
