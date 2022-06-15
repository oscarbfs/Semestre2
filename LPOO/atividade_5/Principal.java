public class Principal {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Jogo jogo = new Jogo();

        try {
            System.out.println("\n----RESULTADOS DA CALCULADORA----\n");

            double num1 = scanner.scannerDouble("Informe o primeiro valor para calcular", "nao");
            double num2 = scanner.scannerDouble("Informe o segundo valor para calcular", "nao");
            
            System.out.println("Resultado da soma: " + calc.somar(num1, num2));
            System.out.println("Resultado da subtração: " + calc.subtrair(num1, num2));
            System.out.println("Resultado da multiplicação: " + calc.multiplicar(num1, num2));
            System.out.println("Resultado da divisão: " + calc.dividir(num1, num2));
            
            System.out.println("\n----JOGO DOS DADOS----\n");

            int numJogadores = scanner.scannerInt("Informe a quantidade de jogadores:", "nao");
            int numDados = scanner.scannerInt("Informe a quantidade de dados:", "nao");
            
            jogo.jogar(numJogadores, numDados);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
