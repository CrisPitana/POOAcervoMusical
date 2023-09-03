package App;

import java.util.ArrayList;

public class Artista {

	private String nomeArtista;

	private ArrayList<Album> artista; // CRIANDO VETOR

	public Artista() { // CONSTRUTOR
		this.artista = new ArrayList<Album>();
	}

	public ArrayList<Album> getArtista() { // GETS AND SETS ARRAY ARTISTA
		return artista;
	}

	public void setArtista(ArrayList<Album> artista) {
		this.artista = artista;
	}

	public String getNomeArtista() { // GETS AND SETS NOME ARTISTA
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public void addAlbum(Album album1) { // METODO CADASTRO
		this.artista.add(album1);
	}

}
