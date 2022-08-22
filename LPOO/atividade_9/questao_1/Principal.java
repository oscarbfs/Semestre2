package LPOO.atividade_9.questao_1;

import java.io.File; // Import the File class

import java.io.IOException; // Import the IOException class to handle errors
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        String filePath = "LPOO/atividade_9/questao_1/Agenda.txt";

        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Agenda agenda = new Agenda(filePath);
        Contato contato1 = new Contato("Oscar", "7112345678", "Alagoinhas");
        Contato contato2 = new Contato("Elton", "7112345678", "Alagoinhas");

        agenda.inserir(contato1);
        agenda.inserir(contato2);
        
        agenda.buscar("Oscar");

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Oscar");
        nomes.add("Elton");
        nomes.add("João");
        agenda.imprimir(nomes);

        agenda.imprimirAgendaCompleta();

        agenda.excluir();


    }
}
