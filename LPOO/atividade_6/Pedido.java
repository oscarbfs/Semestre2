public class Pedido {
    private int numPedido;
    private double valorTotal;
    private boolean pedidoPago;
    private boolean pedidoCancelado;
    private int diaNascimento;
    private int mesNascimetno;
    private String nomeCliente;
    private String telefoneCliente;
    private String descricaoProdutos;

    public Pedido(int numPedido, double valorTotal, boolean pedidoPago, boolean pedidoCancelado, int diaNascimento,
            int mesNascimetno, String nomeCliente, String telefoneCliente, String descricaoProdutos) {
        this.numPedido = numPedido;
        this.valorTotal = valorTotal;
        this.pedidoPago = pedidoPago;
        this.pedidoCancelado = pedidoCancelado;
        this.diaNascimento = diaNascimento;
        this.mesNascimetno = mesNascimetno;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.descricaoProdutos = descricaoProdutos;
    }

    public int getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public boolean isPedidoPago() {
        return pedidoPago;
    }
    public void setPedidoPago(boolean pedidoPago) {
        this.pedidoPago = pedidoPago;
    }
    public boolean isPedidoCancelado() {
        return pedidoCancelado;
    }
    public void setPedidoCancelado(boolean pedidoCancelado) {
        this.pedidoCancelado = pedidoCancelado;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    public String getDescricaoProdutos() {
        return descricaoProdutos;
    }
    public void setDescricaoProdutos(String descricaoProdutos) {
        this.descricaoProdutos = descricaoProdutos;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimetno() {
        return mesNascimetno;
    }

    public void setMesNascimetno(int mesNascimetno) {
        this.mesNascimetno = mesNascimetno;
    }

    @Override
    public String toString() {
        return "Pedido " + numPedido + ":\ndescricaoProdutos = " + descricaoProdutos + "\nnomeCliente = " + nomeCliente + "\npedidoCancelado = " + pedidoCancelado
                + "\npedidoPago = " + pedidoPago + "\ntelefoneCliente = " + telefoneCliente + "\nvalorTotal = " + valorTotal + "\n";
    }

    public void criarPedido(int index) throws Exception {
        this.numPedido = index;
        this.nomeCliente = scanner.scannerString("Informe seu nome", "nao");
        this.telefoneCliente = scanner.scannerString("Informe seu telefone", "nao");
        int descricaoProdutos = scanner.scannerInt("Informe seu pedido\n1 - Hamburger: R$ 18.00\n2 - Pizza: R$ 24.00", "nao");
        if (descricaoProdutos == 1) {
            this.valorTotal = 18;
            this.descricaoProdutos = "Hamburger";
        } else {
            this.valorTotal = 24;
            this.descricaoProdutos = "Pizza";
        }
    }
}