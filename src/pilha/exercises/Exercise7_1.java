package pilha.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise7_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = input.nextInt();
		System.out.println("Digite a base:");
		int base = input.nextInt();
		
		String convertido = conversorDecimal(numero, base);
		
		System.out.println("Numero convertido na base "+base+": "+convertido);
		
		input.close();
	}
	
	public static String conversorDecimal(int numero, int base) {
		if(base > 16) {
			throw new IllegalArgumentException();
		}
		
		Stack<Integer> pilha = new Stack<Integer>();
		String numeroBase = "";
		int resto;
		String bases = "0123456789ABCDEF";
		
		while(numero > 0) {
			resto = numero % base;
			pilha.push(resto);
			numero /= base;
		}
		
		while(!pilha.isEmpty()) {
			numeroBase += bases.charAt(pilha.pop());
		}
		
		return numeroBase;
	}
}
