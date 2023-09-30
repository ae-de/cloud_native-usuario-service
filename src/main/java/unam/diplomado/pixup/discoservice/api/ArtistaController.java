package unam.diplomado.pixup.discoservice.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import unam.diplomado.pixup.discoservice.domain.Artista;
import unam.diplomado.pixup.discoservice.repository.ArtistaRepository;
import unam.diplomado.pixup.discoservice.service.ArtistaService;

@RestController 
@RequestMapping(path="api/artista", produces = "application/json")
@CrossOrigin(origins="*")
public class ArtistaController {
	
	@Autowired
	private ArtistaRepository artistaRepository;
	@Autowired
	private ArtistaService artistaService;
	
	@GetMapping
	public Iterable<Artista> obtenerArtista(){
		return artistaRepository.findAll();
	}
	
	@PostMapping(consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Artista crearArtista(@RequestBody Artista artista) {
		return artistaRepository.save(artista);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Artista> obtenerArtistaPorId(@PathVariable("id") String id) {
		Optional<Artista> artista = artistaRepository.findById(id);
		if (artista.isPresent()) {
			return new ResponseEntity<>(artista.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	@PutMapping(path="{id}", consumes="application/json")
	public ResponseEntity<Artista> actualizarArtista(
			@PathVariable("id") String id, @RequestBody Artista artista) {
		Artista artistaActualizada = artistaService.actualizarArtista(id, artista);
		if (artistaActualizada != null) {
			return new ResponseEntity<>(artistaActualizada, HttpStatus.OK);
					
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarArtista(@PathVariable("id") String id) {
		artistaRepository.deleteById(id);
	}

}
