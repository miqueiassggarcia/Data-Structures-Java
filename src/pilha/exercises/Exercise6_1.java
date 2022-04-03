package pilha.exercises;

import pilha.Pilha;

public class Exercise6_1 {
	public static void main(String[] args) {
		imprimir("A + B");
		imprimir("A + B + (C - D)");
		imprimir(")A + B{}");
		imprimir("{[()]}[](){()}");
		imprimir("{[()]}[]()}");
	}
	
	public static void imprimir(String expressao) {
		System.out.println(expressao + " esta balanceada? " + verificaSimbolos(expressao));
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolos(String expressao) {
		Pilha<Character> pilha = new Pilha<Character>();
		int i = 0;
		char simbolo, topo;

		while(i < expressao.length()) {
			simbolo = expressao.charAt(i);

			if(ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
			} else if(FECHA.indexOf(simbolo) > -1) {
				if(pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();

					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}

			i++;
		}

		return true;
	}	
}

