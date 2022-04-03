package pilha.exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise7 {
	public static void main(String[] args) {
		Stack<Integer> binario = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = input.nextInt();
		
		while(numero!=0) {
			binario.push(numero%2);
			numero /= 2;
		}
		
		System.out.print("O valor binario desse número é: ");
		while(!binario.isEmpty()) {
			System.out.print(binario.pop());
		}
		
		input.close();
	}
}
