package unam.diplomado.pixup.discoservice.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import unam.diplomado.pixup.discoservice.domain.ArtistaAlreadyExistException;

@RestControllerAdvice
public class ArtistaControllerAdvice {
	
	@ExceptionHandler(ArtistaAlreadyExistException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	private String artistaAlreadyExistsHandler(
			ArtistaAlreadyExistException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private String validatorHandler(
			MethodArgumentNotValidException exception) {
		return "Existen errores de validacion en el payload";
	}
}
