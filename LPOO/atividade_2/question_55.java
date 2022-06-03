import java.util.ArrayList;

public class question_55 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantos salrios vai digitar: ", "nao");
        ArrayList<Integer> salarios = new ArrayList<Integer>();

        for (int index = 1; index <= qtde; index++) {
            int salario = scanner.scannerInt("Informe o " + index + "° salario: ", "nao");
            salarios.add(salario);
        }

        double totalSalarios = 0;
        double totalImpostos = 0;

        for (int salario : salarios) {
            double aliquota = 0;
            double deducao = 0;
            if ((1257.13 <= salario) && (salario <= 2512.08)) {
                aliquota = (15/100) * salario;
                deducao = 188.57;
            } else if (salario >= 2512.08) {
                aliquota = (27.5/100) * salario;
                deducao = 502.58;
            }
            double imposto = aliquota + deducao;
            totalImpostos += imposto;
            double salarioReal = salario - imposto;
            totalSalarios += salarioReal;
        }
        System.out.println("O seu salario total é de: " + totalSalarios + " e o imposto total é de: " + totalImpostos);
    }
}
