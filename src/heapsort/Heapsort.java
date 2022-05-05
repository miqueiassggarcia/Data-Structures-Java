package heapsort;

public class Heapsort {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
		}
		
		System.out.println("Vetor desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		
		//Heapsort
		int tam = vetor.length;
		for(int i = tam / 2 - 1; i >= 0; i--) {
			applyHeap(vetor, tam, i);
		}
		
		System.out.println("\nVetor quase ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		
		for(int j = tam - 1; j > 0; j--) {
			int aux = vetor[0];
			vetor[0] = vetor[j];
			vetor[j] = aux;
			
			applyHeap(vetor, j, 0);
		}
		
		System.out.println("\nVetor ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}
	
	private static void applyHeap(int[] vetor, int tam, int i) {
		int raiz = i;
		int esquerda = 2*i + 1;
		int direita = 2*i + 2;
		
		if(esquerda < tam && vetor[esquerda] > vetor[raiz]) {
			raiz = esquerda;
		}
		if(direita < tam && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		
		if(raiz != i) {
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz] = aux;
			
			applyHeap(vetor, tam, raiz);
		}
	}
}
