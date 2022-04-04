package fila.exercises;

public class Pessoa implements Comparable<Pessoa>{
	private String pessoa;
	private int prioridade;
	
	public Pessoa(String pessoa, int prioridade) {
		super();
		this.pessoa = pessoa;
		this.prioridade = prioridade;
	}
	
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [pessoa=" + pessoa + ", prioridade=" + prioridade + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		if(prioridade > o.prioridade) {
			return 1;
		} else if(prioridade < o.prioridade) {
			return -1;
		}
		return 0;
	}
}
