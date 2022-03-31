package exercices;

import java.util.ArrayList;
import java.util.Scanner;

import teste.Contato;

public class Exercise7 extends Exercise6 {
	public static void main(String[] args) {
		//Creating variables
		Scanner input = new Scanner(System.in);

		//Array of contacts
		ArrayList<Contato> contatos = new ArrayList<Contato>();

		//Creating contacts
		criarContatos(30, contatos);

		int opcao = 1;

		//Get the value chosen and calls the certain function
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
				obterContatoPosicao(input, contatos);
				break;
			case 4:
				obterContato(input, contatos);
				break;
			case 5:
				obterUltimoIndice(input, contatos);
				break;
			case 6:
				pesquisarContatoExiste(input, contatos);
				break;
			case 7:
				excluirPosicao(input, contatos);
				break;
			case 8:
				excluirContato(input, contatos);
				break;
			case 9:
				imprimeTamanhoVetor(contatos);
				break;
			case 10:
				limparElementos(contatos);
				break;
			case 11:
				imprimirElementos(contatos);
				break;
			default:
				break;
			}
		}

		System.out.println("Bye");
	}

	//Print all elements of array
	private static void imprimirElementos(ArrayList<Contato> array) {
		System.out.println(array);
	}

	//Clear the array
	private static void limparElementos(ArrayList<Contato> array) {
		array.clear();

		System.out.println("Array limpo com sucesso!");
	}

	//Print the size of array
	private static void imprimeTamanhoVetor(ArrayList<Contato> array) {
		System.out.println("O tamanho do vetor e " + array.size());
	}

	//Get contact from a certain position
	private static void obterContatoPosicao(Scanner input, ArrayList<Contato> array) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = array.get(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Get a contact from array
	private static void obterContato(Scanner input, ArrayList<Contato> array) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = array.get(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa:");

			pos = array.indexOf(contato);

			System.out.println("Contato encontrado na posicao " + pos);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Get the last occurrence of a term in the array
	private static void obterUltimoIndice(Scanner input, ArrayList<Contato> array) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = array.get(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa:");

			pos = array.lastIndexOf(contato);

			System.out.println("O ultimo indice encontrado esta¡ na posicao " + pos);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Seach if a contact exists
	private static void pesquisarContatoExiste(Scanner input, ArrayList<Contato> array) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = array.get(pos);

			boolean existe = array.contains(contato);

			if(existe) {
				System.out.println("Contato existe, dados:\n");
				System.out.println(contato);
			}

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Delete a contact of a certain position
	private static void excluirPosicao(Scanner input, ArrayList<Contato> array) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser removida: ");

		try {
			array.remove(pos);

			System.out.println("Contato exluido");

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Delete a contact
	private static void excluirContato(Scanner input, ArrayList<Contato> array) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser removida: ");

		try {
			Contato contato = array.get(pos);

			array.remove(contato);

			System.out.println("Contato exluido");

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Add contact in final
	private static void adicionandoContatoFinal(Scanner input, ArrayList<Contato> array) {
		Contato contato = pegarDadosContato(input);

		array.add(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println("Dados:\n"+contato);
	}

	//Add contact in certain position
	private static void adicionandoContatoPosicao(Scanner input, ArrayList<Contato> array) {
		Contato contato = pegarDadosContato(input);

		boolean validacao = false;
		int pos = 0;

		while(!validacao) {
			try {
				pos = pegarInformacaoInt(input, "Digite a posiï¿½ï¿½o para adicionar o contato");

				if(pos >= 0) {
					validacao = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Valor invï¿½lido, tente novamente");
			}

		}

		try {
			array.add(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println("Dados:\n"+contato);
		} catch(Exception e) {
			System.out.println("Contato nï¿½o adicionado, posicao invï¿½lida!");
		}
	}

	//Generate contacts to fill the array
	private static void criarContatos(int quant, ArrayList<Contato> array) {
		Contato contato;

		for(int i = 1; i <= quant; i++) {
			contato = new Contato();
			contato.setNome("Contato "+i);
			contato.setEmail("Contato"+i+"@email.com");
			contato.setTelefone("4545487"+i);
			array.add(contato);
		}
	}
}
