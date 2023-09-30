package unam.diplomado.pixup.discoservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import unam.diplomado.pixup.discoservice.domain.Disco;

public interface DiscoRepository 
	extends MongoRepository<Disco, String>{
	
	Optional<Disco> findByArtistas(String artistas);
	

}
