package pilha.exercises;

import java.util.Scanner;
import pilha.Pilha;

public class Exercise5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String nome = input.nextLine();
		
		boolean teste = testaPalindromo(nome);
		if(teste) {
			System.out.println("E um palindromo");
		} else {
			System.out.println("Nao e um palindromo");
		}
		
		input.close();
	}
	
	public static boolean testaPalindromo(String palavra) {
		Pilha<Character> pilha = new Pilha<Character>();
		
		for(int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		while(!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}
		
		if(palavra.equalsIgnoreCase(palavraInversa)) {
			return true;
		}
		
		return false;
	}
}
