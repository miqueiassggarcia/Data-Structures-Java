package exercices;

import java.util.Scanner;

import teste.Contato;
import vetor.Lista;

public class Exercise6 {
	public static void main(String[] args) {
		//criando variáveis
		Scanner input = new Scanner(System.in);
		
		//vetor de contatos
		Lista<Contato> contatos = new Lista<Contato>(20);
		
		//criando contatos
		criarContatos(30, contatos);
		
		int opcao = 1;
		
		while(opcao != 0) {
			opcao = menu(input);
			
			switch (opcao) {
			case 1:
				adicionandoContatoFinal(input, contatos);
				break;
			case 2:
				adicionandoContatoPosicao(input, contatos);
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
			default:
				break;
			}
		}
		
		System.out.println("Bye");
	}
	
	private static void obtemContatoPosicao(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posição a ser consultada: ");
		
		try {
			Contato contato = lista.obter(pos);
			
			System.out.println("O contato existe:\n");
			System.out.println(contato);
			
		} catch(Exception e) {
			System.out.println("Valor inválido, tente novamente!");
		}
		
	}
	
	private static void adicionandoContatoFinal(Scanner input, Lista<Contato> lista) {
		Contato contato = pegarDadosContato(input);
		
		lista.adiciona(contato);
		
		System.out.println("Contato adicionado com sucesso!");
		System.out.println("Dados:\n"+contato);
	}
	
	private static void adicionandoContatoPosicao(Scanner input, Lista<Contato> lista) {
		Contato contato = pegarDadosContato(input);
		
		boolean validacao = false;
		int pos = 0;
		
		while(!validacao) {
			try {
				pos = pegarInformacaoInt(input, "Digite a posição para adicionar o contato");
				
				if(pos >= 0) {
					validacao = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Valor inválido, tente novamente");
			}
			
		}
		
		try {
			lista.adiciona(pos, contato);
			
			System.out.println("Contato adicionado com sucesso!");
			System.out.println("Dados:\n"+contato);
		} catch(Exception e) {
			System.out.println("Contato não adicionado, posicao inválida!");
		}
	}
	
	private static Contato pegarDadosContato(Scanner input) {
		System.out.println("\nAdicione as informações do contato:");
		String nome = pegarInformacao(input, "Digite o nome do contato: ");
		String email = pegarInformacao(input, "Digite o email do contato: ");
		String telefone = pegarInformacao(input, "Digite o telefone do contato: ");
		
		Contato contato = new Contato(nome, telefone, email);
		
		return contato;
	}
	
	private static String pegarInformacao(Scanner input, String mensagem) {
		System.out.println(mensagem);
		String saida = input.nextLine();
		return saida;
	}
	
	private static int pegarInformacaoInt(Scanner input, String mensagem) {
		System.out.println(mensagem);
		String saida = input.nextLine();
		int numero = Integer.parseInt(saida);
		return numero;
	}
	
	private static int menu(Scanner input) {
		boolean validacao = false;
		int escolha = 0;
		String saida;
		
		while(!validacao) {
			System.out.println("DIGITE O VALOR DESEJADO");
			System.out.println("1: Adicionar contato no final");
			System.out.println("2: Adicionar contato em uma posição");
			System.out.println("3: Obter contato de posição desejada");
			System.out.println("4: Buscar contato");
			System.out.println("5: Obter último contato");
			System.out.println("6: Verificar se contato existe");
			System.out.println("7: Remover contato específico");
			System.out.println("8: Remover contato");
			System.out.println("9: Verificar quantidade de contatos");
			System.out.println("10: Excluir todos os contatos");
			System.out.println("11: Imprimir contatos");
			System.out.println("0: Sair");
			
			try {
				saida = input.nextLine();
				escolha = Integer.parseInt(saida);
				
				if(escolha >= 0 && escolha < 12) {
					validacao = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("\nValor inválido, tente novamente\n");
			}
		}
		
		return escolha;
	}
	
	private static void criarContatos(int quant, Lista<Contato> lista) {
		Contato contato;
		
		for(int i = 1; i <= quant; i++) {
			contato = new Contato();
			contato.setNome("Contato "+i);
			contato.setEmail("Contato"+i+"@email.com");
			contato.setTelefone("4545487"+i);
			lista.adiciona(contato);
		}
	}
}
