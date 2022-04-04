package fila.exercises;

import fila.FilaPrioridade;

public class PSAtendimento implements Runnable{
	private FilaPrioridade<Pessoa> fila;
	
	public PSAtendimento(FilaPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		while(!fila.estaVazia()) {
			try {
				System.out.println(fila.desenfileira() + " atendida.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Atendimento concluido.");
	}
	
}
