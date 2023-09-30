package unam.diplomado.pixup.discoservice.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Disquera {
	
	private String id;
	@NotBlank(message="No puede quedar vacío")
	private String nombre;

}
