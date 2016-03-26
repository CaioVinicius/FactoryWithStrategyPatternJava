package Sales;

public class Produto {
	private String nome;
	private float valor;
	
	public Produto(String nome, float valor){
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public float getValor(){
		return this.valor;
	}
	
	public void setNome(float valor){
		this.valor = valor;
	}
}
