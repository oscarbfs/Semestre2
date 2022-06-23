package LPOO.atividade_2;

import java.util.ArrayList;

public class question_50 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantos nomes e notas vai escrever? ", "nao");

        ArrayList<String[]> maioresNotas = new ArrayList<String[]>();
        ArrayList<String[]> pessoas = new ArrayList<String[]>();
        int maiorNota = 0;

        for (int index = 1; index <= qtde; index++) {
            String nome = scanner.scannerString("Informe o " + index + "° nome: ", "nao");
            String nota = scanner.scannerString("Informe a " + index + "° nota: ", "nao");
            String[] pessoa = {nome, nota};
            pessoas.add(pessoa);
            if (index == 1) {
                maioresNotas.add(0, pessoa);
                maiorNota = Integer.parseInt(nota);
            } else {
                if(Integer.parseInt(nota) > maiorNota) {
                    maioresNotas.add(0, pessoa);
                } else if (Integer.parseInt(nota) == maiorNota) {
                    maioresNotas.add(pessoa);
                }
                
            } 
        }
        System.out.println("As maiores notas foram de: ");
        for (String[] elemento : maioresNotas) {
            System.out.println(elemento[0] + " com nota " + elemento[1]);
        }
    }
}
