package automatos;

import java.util.ArrayList;

public class Pedido {
	private int codigo;
	private String status;
	private ArrayList<Produto> lista = new ArrayList<Produto>();
	private Cliente cliente;
	private String metodoPagamento;
		
	//Construtores
	public Pedido() {
		super();

	}

	public Pedido(int codigo, String status, ArrayList<Produto> lista, Cliente cliente, String metodoPagamento) {
		super();
		this.codigo = codigo;
		this.status = status;
		this.lista = lista;
		this.cliente = cliente;
		this.metodoPagamento = metodoPagamento;
	}

	
	//Metodos Getters and Setters
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void addProduto(Produto p) {
		this.lista.add(p);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

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
	
}
