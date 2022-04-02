package pilha.exercises;

import java.util.Scanner;

import pilha.Pilha;

public class Exercise5 {
	public static void main(String[] args) {
		Pilha<String> palindromoMetade1 = new Pilha<String>();
		Pilha<String> palindromoMetade2 = new Pilha<String>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String nome = input.nextLine();
		
		String[] nomesep = nome.split("");
		
		int meio = (int) nomesep.length/2;
		
		boolean isPalindromo = true;
		
		if((nomesep.length%2)==0) {
			for(int i = 0; i < meio; i++) {
				palindromoMetade1.empilha(nomesep[i]);
			}
			
			for(int i = nomesep.length-1; i > meio-1; i--) {
				palindromoMetade2.empilha(nomesep[i]);
			}
			
			while(!palindromoMetade1.estaVazia()) {
				boolean isEqual = palindromoMetade1.desempilha().equals(palindromoMetade2.desempilha());
				if(!isEqual) {
					isPalindromo = false;
				}
			}
		} else {
			for(int i = 0; i < meio; i++) {
				palindromoMetade1.empilha(nomesep[i]);
			}
			
			for(int i = nomesep.length-1; i > meio; i--) {
				palindromoMetade2.empilha(nomesep[i]);
			}
			
			while(!palindromoMetade1.estaVazia()) {
				boolean isEqual = palindromoMetade1.desempilha().equals(palindromoMetade2.desempilha());
				if(!isEqual) {
					isPalindromo = false;
				}
			}
		}
		
		if(isPalindromo) {
			System.out.println("E um palindromo");
		} else {
			System.out.println("Nao e um palindromo");
		}
		
		input.close();
	}
}
