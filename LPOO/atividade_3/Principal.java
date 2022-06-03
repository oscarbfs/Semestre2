public class Principal {
    public static void main(String[] args) {
        System.out.println(new Aluno("Oscar", 2, "AJDJSBOU3846831").toString());
        System.out.println(new Animal("Lobo", "terristre", 4).toString());
        System.out.println(new BombaDeCombustivel(5, 100, 20).toString());
        System.out.println(new Carro(2017, "Fiat", "ANFOI376", "UNO", 4).toString());
        System.out.println(new Calculadora("Cientifica", 8).toString());
        System.out.println(new Cliente(01, "Oscar", 1234567891).toString());
        System.out.println(new ContaBancaria(1000000, "Oscar", 0).toString());
        System.out.println(new Contato("Oscar", 711234567, "oscar@gmail.com").toString());
        System.out.println(new Continente("America do Sul", "Sul", 7).toString());
        System.out.println(new Data(05, 5, 2022).toString());
        System.out.println(new Elevador("metal", 3, 20).toString());
        System.out.println(new Funcionario(01, "Oscar", "Desenvolvedor", 10000).toString());
        System.out.println(new Ingresso("Velozes e Furiosos", "A1", 20, "20:00").toString());
        System.out.println(new JogadorDeFutebol("Oscar", "Meio-campo", 7).toString());
        System.out.println(new Lampada(12, "LED").toString());
        System.out.println(new Livro("Como programar", "Oscar", 10).toString());
        System.out.println(new Moradia("Oscar", 2, 2, "10x8").toString());
        System.out.println(new MovimentoUniforme(10, 2).toString());
        System.out.println(new Musica("Enemy", "Imagine Dragons", "rock").toString());
        System.out.println(new Pais("Brasil", "America do Sul", "Português").toString());
        System.out.println(new Passageiro("Alagoinhas", "Catu", "Oscar", false).toString());
        String[] produtos = {"Pão", "Queijo"};
        System.out.println(new PedidoDeCompra(produtos, 2, "3 dias uteis").toString());
        System.out.println(new Poligono(4, "regular", 4, 8).toString());
        System.out.println(new Ponto2D(5, 10).toString());
        System.out.println(new Professor("Professor Romero", "LPOO", "2° Semestre").toString());
        System.out.println(new Veiculo("carro", "terrestre", "200 km/h", 5).toString());
    }
}