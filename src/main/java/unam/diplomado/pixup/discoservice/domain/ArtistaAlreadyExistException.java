package unam.diplomado.pixup.discoservice.domain;

public class ArtistaAlreadyExistException extends RuntimeException {
	
	public ArtistaAlreadyExistException(String artista) {
		super("Ya existe un artista registrado con ese disco" + artista);
	}

}
