package unam.diplomado.pixup.discoservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unam.diplomado.pixup.discoservice.domain.Artista;
import unam.diplomado.pixup.discoservice.domain.Disco;
import unam.diplomado.pixup.discoservice.domain.ArtistaAlreadyExistException;
import unam.diplomado.pixup.discoservice.repository.DiscoRepository;

@Service
public class DiscoServiceImpl implements DiscoService {
	
	@Autowired
	private DiscoRepository discoRepository;
	
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(DiscoServiceImpl.class);

	@Override
	public Disco registrarDisco(Disco disco, Artista artista) {
		// validación disco existente
		
		Optional<Disco> discoExistente = 
				discoRepository.findByArtistas(disco.getId_artista());
		if (discoExistente.isPresent()) {
			throw new ArtistaAlreadyExistException(disco.getId_artista());
			
		}
		
		//guardar disco
		
		disco.getArtistas().add(artista);		
		discoRepository.save(disco);
		LOG.info("Disco Registrado" + disco);
		
		return null;
	}
	
	

}
