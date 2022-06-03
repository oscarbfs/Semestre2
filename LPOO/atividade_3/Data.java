
public class Data {
    int dia;
    int mes;
    int ano;
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Data [ano=" + ano + ", dia=" + dia + ", mes=" + mes + "]";
    }
}
