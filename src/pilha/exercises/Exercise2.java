package pilha.exercises;

import java.util.Scanner;
import pilha.Pilha;

public class Exercise2 {

	public static void main(String[] args) {
		Pilha<Integer> impar = new Pilha<Integer>();
		Pilha<Integer> par = new Pilha<Integer>();
		Scanner input = new Scanner(System.in);

		int res = 0;
		Integer numPar = 0;
		Integer numImpar = 0;
		for(int i = 0; i < 10; i++) {
			res = menu(input);
			if(res==0) {
				numPar = par.desempilha();
				numImpar = impar.desempilha();
				
				if(numPar == null) {
					System.out.println("Pilha par está vazia");
				} else {
					System.out.println("Desempilhando elemento par: "+numPar);
				}
				
				if(numImpar == null) {
					System.out.println("Pilha impar está vazia");
				} else {
					System.out.println("Desempilhando elemento impar: "+numImpar);
				}
			} else if(res%2 == 0) {
				System.out.println("Empilhando na pilha par: "+res);
				par.empilha(res);
			} else {
				System.out.println("Empilhando na pilha impar: "+res);
				impar.empilha(res);
			}
		}

		System.out.println("Todos os valores foram lidos, desempilhando...");

		while(!(impar.estaVazia() || par.estaVazia())) {
			System.out.println("Desempilhando elemento impar: "+impar.desempilha());
			System.out.println("Desempilhando elemento par: "+par.desempilha());
		}
	}

	public static int menu(Scanner input) {
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		return num;
	}
}