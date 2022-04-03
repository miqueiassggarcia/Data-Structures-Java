package pilha.exercises;

import java.util.Scanner;

import pilha.Pilha;

public class Exercise6 {

	public static void main(String[] args) {
		Pilha<Character> parenteses1 = new Pilha<Character>();
		Pilha<Character> parenteses2 = new Pilha<Character>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma expressao:");
		String nome = input.nextLine();
		String valores = "()";
		Character car1 = valores.charAt(0);
		Character car2 = valores.charAt(1);
		Character caractere;
		boolean ordemCorreta = true;

		for(int i = 0; i < nome.length(); i++) {
			caractere = nome.charAt(i);
			
			if(caractere.equals(car1)) {
				parenteses1.empilha(caractere);
			} else if(caractere.equals(car2)) {
				parenteses2.empilha(caractere);
				if(parenteses1.tamanho()<parenteses2.tamanho()) {
					ordemCorreta = false;
				}
			}
		}
		
		if(parenteses1.tamanho()==parenteses2.tamanho() && ordemCorreta) {
			System.out.println("Parenteses agrupados corretamente");
		} else {
			System.out.println("Parenteses nao estao agrupados corretamente");
		}
		
		input.close();
	}

}
