package unam.diplomado.pixup.discoservice.service;

import unam.diplomado.pixup.discoservice.domain.Artista;
import unam.diplomado.pixup.discoservice.domain.Disco;

public interface ArtistaService {
	
	Artista actualizarArtista(String id, Artista artista);

	static Disco registrarArtista(Disco disco, Artista artista) {
		// TODO Auto-generated method stub
		return null;
	}

}
