package unam.diplomado.pixup.discoservice.service;

import unam.diplomado.pixup.discoservice.domain.Disco;
import unam.diplomado.pixup.discoservice.domain.Artista;

public interface DiscoService {
	
	Disco registrarDisco(Disco disco, Artista artista);

}
