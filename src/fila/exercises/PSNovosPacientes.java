package fila.exercises;

import java.util.Random;

import fila.FilaPrioridade;

public class PSNovosPacientes implements Runnable{
	private FilaPrioridade<Pessoa> fila;
	private int cont = 7;
	private Random prioridade = new Random();
	private final int MAX_PACIENTE = 8;
	
	public PSNovosPacientes(FilaPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		for(int i = 0; i<MAX_PACIENTE; i++) {
			try {
				Thread.sleep(8000);
				Pessoa paciente = new Pessoa("" + cont, prioridade.nextInt(3));
				fila.enfileirar(paciente);
				cont++;
				System.out.println(paciente + " enfileirada.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
