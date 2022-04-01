package pilha.exercises;

import java.util.Scanner;
import pilha.Pilha;

public class Exercise {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		Scanner input = new Scanner(System.in);
		
		int res = 0;
		for(int i = 0; i < 10; i++) {
			res = menu(input);
			if(res%2 == 0) {
				System.out.println("Empilhando "+res);
				pilha.empilha(res);
			} else {
				Integer desempilar = pilha.desempilha();
				
				if(desempilar == null) {
					System.out.println("Pilha vazia");
				} else {
					System.out.println("Número impar desempilhando um elemento: "+desempilar);
				}
				
			}
		}
		
		System.out.println("Todos os valores foram lidos, desempilhando...");
		
		while(!pilha.estaVazia()) {
			System.out.println("Número impar desempilhando um elemento: "+pilha.desempilha());
		}
	}
	
	public static int menu(Scanner input) {
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		return num;
	}

}
