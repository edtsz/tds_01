import java.util.ArrayList;

public class pedidos {

    private double total;
    private int ID;
    private double Tx_entrega;
    private ArrayList<ItemDoPedido> ItemDoPedido = new ArrayList<>();
    private String Cliente;

    public void adicionarItemDoPedido(ItemDoPedido item) {

        this.ItemDoPedido.add(item);
    }
    public void setCliente(String cliente) {
        this.Cliente = Cliente;
    }
    public void settx_entrega(double tx_entrega) {
        this.Tx_entrega = Tx_entrega;
    }
}