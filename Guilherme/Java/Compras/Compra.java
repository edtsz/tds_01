public class Compra {

    private String data;
    private String local;
    private String pagamento;
    private Double frete;
    private Produto produto;
    private Usuario usuario;

    public void setData(String data) {
        

    }
    public String getData() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formato);
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public String getLocal() {
        return this.local;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    public String getPagamento() {
        return this.pagamento;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }
    public double getFrete() {
        return this.frete;
    }

    public void imprimir() {
        System.out.println("_________________________________");
        System.out.println("      Loja de faser compras      ");
        System.out.println("_________________________________");
        System.out.println("Cliente: " + this.usuario);
        System.out.println("E maiol: " + this.usuario.getEmail());
        System.out.println("_________________________________");
        System.out.println("Produto: " + this.produto.getItem());
        System.out.println("Presso: " + this.produto.getValor());
        System.out.println("Descrissão: " + this.produto.getDescrissao());
        System.out.println("_________________________________");
        System.out.println("Pagamento: " + this.pagamento);
        System.out.println("Local: " + this.local);
        System.out.println("Frete: " + this.frete);
        System.out.println("_________________________________");
        System.out.println("OPbrigado pela preferemssia");
        System.out.println("_________________________________");
    }
}
//não terminado