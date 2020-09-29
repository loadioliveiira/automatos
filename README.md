# automatos
Trabalho da cadeira de Linguagens formais e autômatos

Simples projeto desenvolvido para representar um diagrama de um pedido.

A IDE ultilizada foi o VS Code;
Linguagem JAVA;

Classes:
  -PEDIDO
    int codigo;
    string status;
    ArrayList<Produto> lista = new ArrayList<produto>();
    Cliente cliente;
    String metodoPagamento;
  -CLIENTE
    int codCliente;
    String nomeCliente;
    String endCliente;
  -PRODUTO
    int codigo;
    float custo; (valor)
    String nome;
  
<< Metodos Getters and Setters ultilizados >>
  
  public int getCodigo();
  public void setCodigo(int codigo);
  public String getStatus();
  public void setStatus(String status);
  public ArrayList<Produto> getLista();
  public void addProduto(Produto p);
  public Cliente getCliente();
  public void setCliente(Cliente cliente);
 
  >> METODO PAGAMENTO <<
  
    public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	public void verificarMetodoPagamento() {
		if(this.getMetodoPagamento() == "") {
			this.setStatus("Pedido Negado");
		}
	}
  
  
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////
  
 >>   EXEMPLO DE APLICAÇÃO NA MAIN   <<

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
