import java.util.ArrayList;

public class Empresa {

    public static void main(String[] args) {
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        ArrayList<Empregado> empregados = new ArrayList<>();

        Fornecedor fornecedor1 = new Fornecedor("Romero", "Catu", "7112345678", 10000.0, 0.0);
        fornecedores.add(fornecedor1);
        Fornecedor fornecedor2 = new Fornecedor("Elton", "Alagoinhas", "717496937", 3000.0, 250.0);
        fornecedores.add(fornecedor2);
        Fornecedor fornecedor3 = new Fornecedor("Oscar", "Alagoinhas", "717364521", 7000.0, 170.0);
        fornecedores.add(fornecedor3);
        
        Empregado empregado1 = new Empregado("João", "Alagoinhas", "71368429643", 1, 20000, 15);
        empregados.add(empregado1);
        Empregado empregado2 = new Empregado("Maria", "Alagoinhas", "71368429643", 2, 15000, 15);
        empregados.add(empregado2);
        Empregado empregado3 = new Empregado("Carol", "Alagoinhas", "71368429643", 3, 6000, 15);
        empregados.add(empregado3);

        System.out.println("\nLISTA DE FORNECEDORES\n");
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("\nNome: " + fornecedor.getNome());
            System.out.println("Endereco: " + fornecedor.getEndereco());
            System.out.println("Telefone: " + fornecedor.getTelefone());
            System.out.println("Credito: " + fornecedor.getValorCredito());
            System.out.println("Divida: " + fornecedor.getValorDivida());
            System.out.println("Saldo: " + fornecedor.obterSaldo());
            System.out.println("\n-------------------------------------\n");
        }
        
        System.out.println("\nLISTA DE EMPREGADOS\n");
        for (Empregado empregado : empregados) {
            System.out.println("\nNome: " + empregado.getNome());
            System.out.println("Endereco: " + empregado.getEndereco());
            System.out.println("Telefone: " + empregado.getTelefone());
            System.out.println("Codigo do Setor: " + empregado.getCodigoSetor());
            System.out.println("Salario Bruto: " + empregado.getSalarioBase());
            System.out.println("Taxa de Imposto: " + empregado.getImposto());
            System.out.println("Salário Liquido: " + empregado.calcularSalario());
            System.out.println("\n-------------------------------------\n");
            
        }
    }
}
