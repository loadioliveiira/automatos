package automatos;

public class Principal {

	public static void main(String[] args) {
		Cliente igor =  new Cliente();
		igor.setCodCliente(1);
		igor.setNomeCliente("Igor Oliveira");
		igor.setEndCliente("Av. Pompilio GOmes");
		
		Produto skol300ml = new Produto();
		skol300ml.setCodigo(10);
		skol300ml.setNome("Skol lata 300 ml");
		skol300ml.setCusto(2.25f);
		
		Pedido p1 =  new Pedido();
		p1.setCliente(igor);
		p1.setCodigo(100);
		p1.setMetodoPagamento("Cartão");
		p1.setStatus("Novo Pedido");
		p1.addProduto(skol300ml);
		
		p1.verificarMetodoPagamento();
		
	}

}
