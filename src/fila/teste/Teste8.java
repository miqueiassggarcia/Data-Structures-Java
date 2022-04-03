package fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Teste8 {
	public static void main(String[] args) {
		Queue<Paciente> filaPrioridade = new PriorityQueue<>(
			new Comparator<Paciente>() {
				@Override
				public int compare(Paciente p0, Paciente p1) {
					/*if(p0.getPrioridade() > p1.getPrioridade()) {
						return 1;
					} else if(p0.getPrioridade() < p1.getPrioridade()) {
						return -1;
					}
					
					return 0;*/
					
					return Integer.valueOf(p0.getPrioridade()).compareTo(p1.getPrioridade());
				}
				
			}
		);
		
		filaPrioridade.add(new Paciente("A", 2));
		filaPrioridade.add(new Paciente("B", 1));
		
		System.out.println(filaPrioridade);
	}
}
