package LPOO.atividade_5;

public class Calculadora {
    public double somar(double parcela1, double parcela2) {
        double resultado = parcela1 + parcela2;
        return resultado;
    }
    public double subtrair(double aditivo, double subtrativo) {
        double resultado = aditivo - subtrativo;
        return resultado;
    }
    public double multiplicar(double fator1, double fator2) {
        double resultado = fator1 * fator2;
        return resultado;
    }
    public double dividir(double dividendo, double divisor) throws Exception{
        if(divisor == 0) {
            throw new Exception("Não é permitido fazer uma divisão por zero!");
        }
        return dividendo / divisor;
    }
    
}