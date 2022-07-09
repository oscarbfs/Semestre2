package LPOO.atividade_programada;

import java.util.ArrayList;

public class Interface {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Oscar", 123456, 123, new ArrayList<>()));
        Banco banco = new Banco("OscarBank", clientes);

        int index = 0;

        while (true) {
            try {
                int comando = scanner.scannerInt(
                    "Você já é um cliente cadastrado?\n" +
                            "1 - Sim\n" +
                            "2 - Não\n" +
                            "3 - Sair\n",
                    "nao");
                if (comando == 1) {
                    int cpf = scanner.scannerInt("Informe seu CPF (somente numeros):", "nao");
                    int senha = scanner.scannerInt("Informe sua senha do seu perfil:", "nao");
                    banco.autencicarCliente(cpf, senha, index);
                    index++;
                } else if (comando == 2) {
                    int newComando = scanner.scannerInt(
                            "Deseja se cadastrar?\n" +
                                    "1 - Sim\n" +
                                    "2 - Não. Voltar para menu anterior.\n",
                            "nao");
                    if (newComando == 1) {
                        banco.cadastrarCliente();
                    } 
                } else {
                    break;
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
