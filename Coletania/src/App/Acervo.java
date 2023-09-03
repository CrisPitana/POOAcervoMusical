package App;

import java.util.ArrayList;

public class Acervo {

	public ArrayList<Artista> acervo;
	public Artista a1;
	int i;

	Acervo() {
		this.acervo = new ArrayList<Artista>();
	}

	public ArrayList<Artista> getAcervo() {
		return acervo;
	}

	public void setAcervo(ArrayList<Artista> acervo) {
		this.acervo = acervo;
	}

	public void cadastro(Artista artista1) { // METODO CADASTRO
		this.acervo.add(artista1);
	}

	public void buscarPessoa(String x) { // BUSCA POR NOME

		for (i = 0; i < acervo.size(); i++) {
			Artista a1 = acervo.get(i);
			if (a1.getNomeArtista().equalsIgnoreCase(x)) {
				System.out.println(acervo.get(i));
				return;
			}
		}
		System.out.println("Nao encontrado!");
	}

	public int qtdeArtista() { // QTDE ARTISTAS
		return this.acervo.size();
	}

	@Override // TOTAL DE ARTISTAS E SEUS ALBUNS
	public String toString() {
		return "ListaDeArtistas {" + "Artista=" + acervo + '}';
	}

	public void apagarTudo() { // LIMPAR LISTA
		this.acervo.clear();
	}

}
