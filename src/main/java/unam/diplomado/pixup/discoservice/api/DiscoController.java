/*

package unam.diplomado.pixup.discoservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import unam.diplomado.pixup.discoservice.domain.Artista;
import unam.diplomado.pixup.discoservice.domain.Disco;
import unam.diplomado.pixup.discoservice.dto.RegistroArtistaRequest;
import unam.diplomado.pixup.discoservice.service.ArtistaService;
import unam.diplomado.pixup.discoservice.service.DiscoService;

@RestController

public class DiscoController implements ArtistaApi {
	
	@Autowired
	private DiscoService discoService;

	@Override
	public Disco registrarDisco(
			RegistroArtistaRequest request) {
		return ArtistaService.registrarArtista(
				request.getDisco(), request.getArtista());
	

	@Override Artista registrarArtista(@NotNull @Valid RegistroArtistaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}}

	@Override
	public Artista registrarArtista(@NotNull @Valid RegistroArtistaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/