public class question_23 {
    public static void main(String[] args) {
        function();
    }

    // Esta dando errado

    static void function() {
        String palavra = scanner.scannerString("Escreva uma palavra: ", "sim");

        String[] array_letras = palavra.split("");
        int tamanho = array_letras.length;
        String palavraInvertida = "";

        for ( int i =  tamanho - 1 ; i >= 0 ; i-- ) {
            palavraInvertida = palavraInvertida + array_letras[i] + "";
        }

        String polindromo;
        if (palavraInvertida == palavra) {
            polindromo = "é";
        } else {
            polindromo = "não é";
        }

        System.out.println(palavra == palavraInvertida);
        System.out.println(palavra + " " + palavraInvertida);
        System.out.println("Essa palavra " + polindromo + " um polindromo");
    }
}
