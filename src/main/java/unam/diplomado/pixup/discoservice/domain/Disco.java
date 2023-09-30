package unam.diplomado.pixup.discoservice.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="canciones")
public class Disco {
	
	@Id
	private String id;
	@NotBlank(message = "titulo no puede estar vacio")
	private String titulo;
	private String precio;
	@NotBlank(message = "existencia no puede estar vacio")
	private String existencia;
	private String descuento;
	private String fecha_lanzamiento;
	private String imagen;
	private String id_disquera;
	private String id_artista;
	private String id_genero_musical;
	private Collection<Artista> artistas = new LinkedHashSet<>();

}
