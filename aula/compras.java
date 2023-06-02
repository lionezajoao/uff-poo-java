class Cliente {
    String nome;
    String cep;
}

class Itens {;
    int qtd;
    float valor;
    String nome;
}

class Pedido {
    String id;
    Cliente cliente;
    Itens[] itensComprados;
}

public class compras {
    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();

        novoPedido.id = "abc";
        novoPedido.cliente.nome = "Joao";
        novoPedido.cliente.cep = "2400000";
        novoPedido.itensComprados[0].qtd = 1;
        novoPedido.itensComprados[0].valor = 12;
        novoPedido.itensComprados[0].nome = "energetico";

        System.out.println(novoPedido);

    }
}
