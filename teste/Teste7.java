package teste;

import vetor.VetorObjetos;

public class Teste7 {
	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(5);
		
		Contato c1 = new Contato("João", "98989898", "João@email.com");
		Contato c2 = new Contato("Pedro", "48765413", "Pedro@email.com");
		Contato c3 = new Contato("Lima", "26841348", "Lima@email.com");
		Contato c4 = new Contato("Lima", "26841348", "Lima@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("O elemento existe no vetor");
		} else {
			System.out.println("O elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}
}