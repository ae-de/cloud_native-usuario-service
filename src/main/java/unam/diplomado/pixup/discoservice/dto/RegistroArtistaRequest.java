package unam.diplomado.pixup.discoservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import unam.diplomado.pixup.discoservice.domain.Disco;
import unam.diplomado.pixup.discoservice.domain.Artista;

@Data
@NoArgsConstructor
public class RegistroArtistaRequest {
	
	@NotNull
	@Valid
	private Disco disco;
	@NotNull
	@Valid
	private Artista artista;

}
