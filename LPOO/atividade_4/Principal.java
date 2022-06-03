public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Oscar", 2, "AJDJSBOU3846831");
        aluno.setSemestre(3);
        aluno.estudar();
        System.out.println(aluno.toString());
        
        Animal animal = new Animal("Lobo", "terristre", 4);
        animal.getHabitat();
        animal.cacar();
        System.out.println(animal.toString());
        
        BombaDeCombustivel bomba = new BombaDeCombustivel(5, 100, 20);
        bomba.setValorLitros(6);
        bomba.encher(45);
        System.out.println(bomba.toString());
        
        Carro carro = new Carro(2017, "Fiat", "ANFOI376", "UNO", 4);
        carro.getMarca();
        carro.ligar();
        System.out.println(carro.toString());
        
        Calculadora calc = new Calculadora("Cientifica", 8);
        calc.setTipo("Normal");
        calc.somar(2, 2);
        System.out.println(calc.toString());
        
        Cliente cliente = new Cliente(01, "Oscar", 1234567891);
        cliente.getCpf();
        cliente.fazerPedido("hamburguer");
        System.out.println(cliente.toString());

        String[] produtos = {"Pão", "Queijo"};
        
        ContaBancaria conta = new ContaBancaria(1000000, "Oscar", 0);
        conta.setFatura(10000);
        conta.pagarFatura(1000);
        System.out.println(conta.toString());
        
        Contato contato = new Contato("Oscar", 711234567, "oscar@gmail.com");
        contato.setNome("Elton");
        contato.mandarEmailPara("Salve");
        System.out.println(contato.toString());
        
        Continente continente = new Continente("America do Sul", "Sul", 7);
        continente.getRegiao();
        continente.setNome("Chile");
        System.out.println(continente.toString());
        
        Data data = new Data(05, 5, 2022);
        data.setDia(11);
        data.marcarData("Entregar atividade");
        System.out.println(data.toString());
        
        Elevador elevador = new Elevador("metal", 3, 20);
        elevador.getMaterial();
        elevador.irPara(7);
        System.out.println(elevador.toString());
        
        Funcionario funcionario = new Funcionario(01, "Oscar", "Desenvolvedor", 10000);
        funcionario.setCargo("Gerente");
        funcionario.demitir("Não quis trabalhar.");
        System.out.println(funcionario.toString());
        
        Ingresso ingresso = new Ingresso("Velozes e Furiosos", "A1", 20, "20:00");
        ingresso.getFilme();
        ingresso.comprar();
        System.out.println(ingresso.toString());
        
        JogadorDeFutebol jogadorDeFutebol = new JogadorDeFutebol("Oscar", "Bahia","Meio-campo", 7);
        jogadorDeFutebol.setNumeroCamisa(10);
        jogadorDeFutebol.transferir( "PSG");
        System.out.println(jogadorDeFutebol.toString());
        
        Lampada lampada = new Lampada(12, "LED");
        lampada.getTipo();
        lampada.acender();
        System.out.println(lampada.toString());
        
        Livro livro = new Livro("Como programar", "Oscar", 10);
        livro.setTitulo("Como programar em Python");
        livro.vender();
        System.out.println(livro.toString());
        
        Moradia moradia = new Moradia("Oscar", 2, 2, "10x8");
        moradia.getQtdeQuartos();
        moradia.comprar("Elton");
        System.out.println(moradia.toString());
        
        MovimentoUniforme movimentoUniforme = new MovimentoUniforme(10, 2);
        movimentoUniforme.setVelociadade(20);
        movimentoUniforme.calcular();
        System.out.println(movimentoUniforme.toString());
        
        Musica musica = new Musica("Enemy", "Imagine Dragons", "rock");
        musica.getCompositor();
        musica.tocar();
        System.out.println(musica.toString());
        
        Pais pais = new Pais("Brasil", "America do Sul", "Português");
        pais.setNome("Chile");
        pais.getContinente();
        System.out.println(pais.toString());
        
        Passageiro passageiro = new Passageiro("Alagoinhas", "Catu", "Oscar", false);
        passageiro.getNome();
        passageiro.descerAntes();
        System.out.println(passageiro.toString());
        
        PedidoDeCompra pedidoDeCompra = new PedidoDeCompra(produtos, 2, "3 dias uteis");
        pedidoDeCompra.setValor(7);
        pedidoDeCompra.getPrazoEntrega();
        System.out.println(pedidoDeCompra.toString());
        
        Poligono poligono = new Poligono(4, "regular", 4, 8);
        poligono.getArea();
        poligono.saberLados(true);
        System.out.println(poligono.toString());
        
        Ponto2D ponto2d = new Ponto2D(5, 10);
        Ponto2D ponto2d2 = new Ponto2D(10, 5);
        ponto2d.setPontoX(20);
        ponto2d.saberDistancia(ponto2d2);
        System.out.println(ponto2d.toString());
        
        Professor professor = new Professor("Professor Romero", "LPOO", "2° Semestre");
        professor.getDisciplinaLecionada();
        professor.darAula();
        System.out.println(professor.toString());
        
        Veiculo veiculo = new Veiculo("carro", "terrestre", "200 km/h", 5);
        veiculo.setVelocidadeMax("300 km/h");
        veiculo.pisarFundo();
        System.out.println(veiculo.toString());
    }
}