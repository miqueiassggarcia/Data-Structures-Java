package exercices;

import java.util.Scanner;

import teste.Contato;
import vetor.Lista;

public class Exercise6 {
	public static void main(String[] args) {
		//Creating variables
		Scanner input = new Scanner(System.in);

		//Array of contacts
		Lista<Contato> contatos = new Lista<Contato>(20);

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

	//Function to get a information from user in string
	private static String pegarInformacao(Scanner input, String mensagem) {
		System.out.println(mensagem);
		String saida = input.nextLine();
		return saida;
	}

	//Function to get a information from user in int
	private static int pegarInformacaoInt(Scanner input, String mensagem) {
		System.out.println(mensagem);
		String saida = input.nextLine();
		int numero = Integer.parseInt(saida);
		return numero;
	}

	//Function to get new contact from user
	private static Contato pegarDadosContato(Scanner input) {
		System.out.println("\nAdicione as informacoes do contato:");
		String nome = pegarInformacao(input, "Digite o nome do contato: ");
		String email = pegarInformacao(input, "Digite o email do contato: ");
		String telefone = pegarInformacao(input, "Digite o telefone do contato: ");

		Contato contato = new Contato(nome, telefone, email);

		return contato;
	}

	//Print all elements of array
	private static void imprimirElementos(Lista<Contato> lista) {
		System.out.println(lista);
	}

	//Clear the array
	private static void limparElementos(Lista<Contato> lista) {
		lista.limpar();

		System.out.println("Lista limpa com sucesso!");
	}

	//Print the size of array
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("O tamanho do vetor e " + lista.tamanho());
	}

	//Get contact from a certain position
	private static void obterContatoPosicao(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = lista.obter(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Get a contact from array
	private static void obterContato(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = lista.obter(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa:");

			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posicao " + pos);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Get the last occurrence of a term in the array
	private static void obterUltimoIndice(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = lista.obter(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa:");

			pos = lista.ultimoIndice(contato);

			System.out.println("O ultimo indice encontrado esta¡ na posicao " + pos);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Seach if a contact exists
	private static void pesquisarContatoExiste(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = lista.obter(pos);

			boolean existe = lista.contem(contato);

			if(existe) {
				System.out.println("Contato existe, dados:\n");
				System.out.println(contato);
			}

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Delete a contact of a certain position
	private static void excluirPosicao(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser removida: ");

		try {
			lista.remove(pos);

			System.out.println("Contato exluido");

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Delete a contact
	private static void excluirContato(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser removida: ");

		try {
			Contato contato = lista.obter(pos);

			lista.remove(contato);

			System.out.println("Contato exluido");

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}

	//Add contact in final
	private static void adicionandoContatoFinal(Scanner input, Lista<Contato> lista) {
		Contato contato = pegarDadosContato(input);

		lista.adiciona(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println("Dados:\n"+contato);
	}

	//Add contact in certain position
	private static void adicionandoContatoPosicao(Scanner input, Lista<Contato> lista) {
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
			lista.adiciona(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println("Dados:\n"+contato);
		} catch(Exception e) {
			System.out.println("Contato nï¿½o adicionado, posicao invï¿½lida!");
		}
	}

	//Print the menu
	private static int menu(Scanner input) {
		boolean validacao = false;
		int escolha = 0;
		String saida;

		while(!validacao) {
			System.out.println("DIGITE O VALOR DESEJADO");
			System.out.println("1: Adicionar contato no final");
			System.out.println("2: Adicionar contato em uma posiï¿½ï¿½o");
			System.out.println("3: Obter contato de posicao desejada");
			System.out.println("4: Buscar contato");
			System.out.println("5: Obter ultimo contato");
			System.out.println("6: Verificar se contato existe");
			System.out.println("7: Remover contato especï¿½fico");
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
				System.out.println("\nValor invï¿½lido, tente novamente\n");
			}
		}

		return escolha;
	}

	//Generate contacts to fill the array
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
