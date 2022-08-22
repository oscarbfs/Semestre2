package LPOO.atividade_9.questao_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private String filePath;

    public Agenda(String filePath) {
        this.filePath = filePath;
    }

    public void inserir(Contato contato) {
        try {

            FileWriter myWriter = new FileWriter(this.filePath, true);

            myWriter.write(contato.toString() + "\n");
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e) {
            
            System.out.println("An error occurred.");
            
            e.printStackTrace();
        }
    };

    public void excluir() {
        File filePath = new File(this.filePath);
        if(filePath.delete()) {
            System.out.println("A agenda foi deletada com secesso!");
        } else {
            System.out.println("A agenda não foi deletada!");
        }
    };

    public void buscar(String nome) {

        try {
            File myObj = new File(this.filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.contains(nome)) {
                    System.out.println("Contato Encontrado:\n");
                    System.out.println(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    };

    public void imprimir(ArrayList<String> nomes) {
        try {
            File myObj = new File(this.filePath);
            Scanner myReader = new Scanner(myObj);
            System.out.println("\nContatos com esses nomes:\n");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (String nome : nomes) {
                    if(data.contains(nome)) {
                        System.out.println(data);
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    };

    public void imprimirAgendaCompleta() {
        try {
            File myObj = new File(this.filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    };

}
