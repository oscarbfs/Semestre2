import java.util.ArrayList;

public class question_58 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        ArrayList<Double> lados = new ArrayList<Double>();

        for (int index = 1; index <= 3; index++) {
            double lado = scanner.scannerDouble("Informe o " + index + "° lado do triangulo: ", "nao");
            lados.add(lado);
        }

        double lado1 = lados.get(0);
        double lado2 = lados.get(1);
        double lado3 = lados.get(2);
        String tipoTriangulo = "";

        if ((lado1 < (lado2 + lado3)) && (lado2 < (lado1 + lado3)) && (lado3 < (lado2 + lado1))) {
            if ((lado1 == lado2) && (lado2 == lado3)) {
                tipoTriangulo = "equilátero";
            } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                tipoTriangulo = "isósceles";
            } else {
                tipoTriangulo = "escaleno";
            }
            System.out.println("Isso é um triangulo " + tipoTriangulo);
        } else {
            System.out.println("Isso não é um triangulo");
        }


        
    }
}
