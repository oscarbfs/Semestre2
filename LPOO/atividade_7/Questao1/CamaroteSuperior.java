package LPOO.atividade_7.Questao1;

public class CamaroteSuperior extends Vip{

    private double valorAdicionalCamaroteSuperior;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalCamaroteSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalCamaroteSuperior = valorAdicionalCamaroteSuperior;
    }

    public double getValorAdicionalCamaroteSuperior() {
        return valorAdicionalCamaroteSuperior;
    }
    
    public void setValorAdicionalCamaroteSuperior(double valorAdicionalCamaroteSuperior) {
        this.valorAdicionalCamaroteSuperior = valorAdicionalCamaroteSuperior;
    }

    public double getValorTotalCamaroteSuperior() {
        return valorAdicionalCamaroteSuperior + getValorTotalVip();
    }
}
