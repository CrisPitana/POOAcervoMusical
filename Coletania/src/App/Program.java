package App;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Acervo acervo1 = new Acervo();
		Artista artista1 = new Artista();

		int op;
		int continua = 0;

		System.out.println("_____ COLETANIA  _____");
		do {
			System.out.println("\nDigite uma opção: ");
			System.out.println("1 - Cadastrar Artista");
			System.out.println("2 - Buscar Artista");
			System.out.println("3 - Ver Qtde Artistas");
			System.out.println("4 - Apagar todos os Artistas");
			System.out.println("5 - Ver total de Artistas");
			System.out.println("0 - Sair");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Nome do artista ? "); // CADASTRA ARTISTA
				sc.nextLine();
				artista1.setNomeArtista(sc.nextLine());
				do {
					Album album1 = new Album();
					System.out.println("Nome do album ? "); // CADASTRA ALBUM AO ARTISTA
					sc.nextLine();
					artista1.addAlbum(album1);
					System.out.println("Deseja adicionar mais albuns ao artista ? \n 0- Sim \n 1 - Não");
					continua = sc.nextInt();
				} while (continua == 0);
				acervo1.cadastro(artista1);
				break;

			case 2: // BUSCA POR NOME VISUALIZA
				System.out.println("Digite o artista : ");
				sc.nextLine();
				acervo1.buscarPessoa(sc.nextLine());
				break;

			case 3: // VER QTDE DE ARTISTA
				System.out.println("Total de Artista : " + acervo1.qtdeArtista());
				break;

			case 4: // LIMPAR ACERVO
				if (acervo1.getAcervo().isEmpty())
					System.out.println("Não há artistas para excluir?");
				else {
					System.out.println("Tem certeza que deseja excluir todos os registros ?  \n 0 Sim  \n 1 - Não");
					continua = sc.nextInt();
					if (continua == 0)
						acervo1.apagarTudo();
					if (continua == 1)
						return;
					else
						System.out.println("Opção Inválida");
				}
				break;

			case 5: // VER LISTA COMPLETA
				if (acervo1.getAcervo().isEmpty())
					System.out.println("Não há Artistas");
				else
					System.out.println(acervo1);
				break;

			case 0: // FINALIZAR SISTEMA
				System.out.println("Sistema finalizado! ");
				return;

			default:
				System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");
			}

		} while (op != 0);

		sc.close();

	}

}
