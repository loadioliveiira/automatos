package automatos;

public class Produto {
	private int codigo;
	private float custo;
	private String nome;
	
	
	//Construtores
	
	public Produto() {
		super();
	}

	public Produto(int codigo, float custo, String nome) {
		super();
		this.codigo = codigo;
		this.custo = custo;
		this.nome = nome;
	}
	
	//Geters and Seters
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		this.custo = custo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
