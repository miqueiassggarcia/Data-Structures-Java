package pilha.exercises;

public class Livro {
	private String nome;
	private int isbn;
	private int anoLancamento;
	private String autor;
	
	public Livro(String nome, int isbn, int anoLancamento, String autor) {
		this.nome = nome;
		this.isbn = isbn;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
	}
	
	public Livro() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", isbn=" + isbn + ", anoLancamento=" + anoLancamento + ", autor=" + autor + "]";
	}
}
