package es.urjc.etsii.Gameflix.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.urjc.etsii.Gameflix.msg.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	Usuario findByUserAndPass(String user, String pass);

}
