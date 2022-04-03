package fila.teste;

public class Paciente {// implements Comparable<Paciente>{
	private String nome;
	private int prioridade;
	
	public Paciente() {
	}
	
	public Paciente(String nome, int prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	/*@Override
	public int compareTo(Paciente o) {
		if(this.prioridade > o.getPrioridade()) {
			return 1;
		} else if(this.prioridade < o.getPrioridade()) {
			return -1;
		}
		
		return 0;
	}*/

	@Override
	public String toString() {
		return "[nome=" + nome + ", prioridade=" + prioridade + "]";
	}
}
