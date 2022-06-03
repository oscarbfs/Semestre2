
public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Data [ano=" + ano + ", dia=" + dia + ", mes=" + mes + "]";
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void dataDeNascimento() {
        System.out.println("Seu aniversario está definido para: " + this.dia + "/" + this.mes + "/" + this.ano);
    }
    public void marcarData(String compromisso) {
        System.out.println(compromisso + ". Marcado para o dia: " + this.dia + "/" + this.mes + "/" + this.ano);
    }

}
