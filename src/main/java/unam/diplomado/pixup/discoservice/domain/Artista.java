package unam.diplomado.pixup.discoservice.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Artista {
	
	private String id;
	@NotBlank(message="nombre no puede ser vacío")
	private String nombre;

}
