package exercices;

import java.util.Scanner;

import teste.Contato;
import vetor.Lista;

public class Exercise6 {
	public static void main(String[] args) {
		//criando variaveis
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
	
	private static void imprimirElementos(Lista<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparElementos(Lista<Contato> lista) {
		lista.limpar();
		
		System.out.println("Lista limpa com sucesso!");
	}
	
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("O tamanho do vetor é " + lista.tamanho());
	}

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
	
	private static void obterUltimoIndice(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser consultada: ");

		try {
			Contato contato = lista.obter(pos);

			System.out.println("O contato existe:\n");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa:");

			pos = lista.ultimoIndice(contato);

			System.out.println("O último indice encontrado está na posicao " + pos);

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}
	
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
	
	private static void excluirPosicao(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Digite a posicao a ser removida: ");

		try {
			lista.remove(pos);
			
			System.out.println("Contato exluido");

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
		}

	}
	
	private static void excluirContato(Scanner input, Lista<Contato> lista) {
		int pos = pegarInformacaoInt(input, "Di gite a posicao a ser removida: ");

		try {
			Contato contato = lista.obter(pos);
			
			lista.remove(contato);
			
			System.out.println("Contato exluido");

		} catch(Exception e) {
			System.out.println("Valor invalido, tente novamente!");
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
				pos = pegarInformacaoInt(input, "Digite a posi��o para adicionar o contato");

				if(pos >= 0) {
					validacao = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Valor inv�lido, tente novamente");
			}

		}

		try {
			lista.adiciona(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println("Dados:\n"+contato);
		} catch(Exception e) {
			System.out.println("Contato n�o adicionado, posicao inv�lida!");
		}
	}

	private static Contato pegarDadosContato(Scanner input) {
		System.out.println("\nAdicione as informa��es do contato:");
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
			System.out.println("2: Adicionar contato em uma posi��o");
			System.out.println("3: Obter contato de posi��o desejada");
			System.out.println("4: Buscar contato");
			System.out.println("5: Obter �ltimo contato");
			System.out.println("6: Verificar se contato existe");
			System.out.println("7: Remover contato espec�fico");
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
				System.out.println("\nValor inv�lido, tente novamente\n");
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
