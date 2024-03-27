public class compra {

    private String Data;
    private String Local;
    private String Pagamento;
    private Double Frete;

    public void setData(String Data) {
        this.Data = Data;
    }
    public String getData() {
        return this.Data;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }
    public String getLocal() {
        return this.Local;
    }

    public void setPagamento(String Pagamento) {
        this.Pagamento = Pagamento;
    }
    public String getPagamento() {
        return this.Pagamento;
    }

    public void setFrete(Double Frete) {
        this.Frete = Frete;
    }
    public double getFrete() {
        return this.Frete;
    }

    public void imprimir() {
        System.out.println("_________________________________");
        System.out.println("            Loja Looj            ");
        System.out.println("_________________________________");
        System.out.println("Cliente: " + this.Usuario);
        System.out.println("E maiol: " + this.Email);
        System.out.println("_________________________________");
        System.out.println("Produto: " + this.Item);
        System.out.println("Presso: " + this.Valor);
        System.out.println("Descrissão: " + this.Descrissao);
        System.out.println("_________________________________");
        System.out.println("Pagamento: " + this.Pagamento);
        System.out.println("Local: " + this.Local);
        System.out.println("Frete: " + this.Frete);
        System.out.println("_________________________________");
        System.out.println("OPbrigado pela preferemssia");
        System.out.println("_________________________________");
    }
}