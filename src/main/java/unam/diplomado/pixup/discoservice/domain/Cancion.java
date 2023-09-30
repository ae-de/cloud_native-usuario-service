package unam.diplomado.pixup.discoservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="canciones")
public class Cancion {
	
	@Id
	private String id;
	private String titulo;
	private String duracion;
	private String id_disco;

}
