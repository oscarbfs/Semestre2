package LPOO.atividade_1;

import java.util.Scanner;

public class questao_2 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o numero que deseja o antecessor");
        Integer resposta = scanner.nextInt();  
        int antecessor = resposta -  1;
        
        System.out.println(String.format("O antecessor é: %d", antecessor));  

        scanner.close();
    }
}
