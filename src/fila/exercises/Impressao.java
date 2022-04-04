package fila.exercises;

public class Impressao {
	private String nome;
	private int quantFolhas;
	
	public Impressao(String nome, int quantFolhas) {
		super();
		this.nome = nome;
		this.quantFolhas = quantFolhas;
	}
	
	public Impressao() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantFolhas() {
		return quantFolhas;
	}
	public void setQuantFolhas(int quantFolhas) {
		this.quantFolhas = quantFolhas;
	}
	
	@Override
	public String toString() {
		return "Impressao [nome=" + nome + ", quantFolhas=" + quantFolhas + "]";
	}
}
