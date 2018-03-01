package es.urjc.etsii.Gameflix.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.urjc.etsii.Gameflix.msg.Login;
import es.urjc.etsii.Gameflix.msg.Usuario;
import es.urjc.etsii.Gameflix.repositories.UsuarioRepository;

@Service
public class UsuariosService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
//	List<Usuario> usuarios;
////	Datos de usuarios: nombre de usuario, contraseña, nombre, apellidos, dirección de correo
////	electrónico, fecha de nacimiento, país, ciudad de residencia y perfil, que podrá ser “Gamer” ó
////	“Admin”. Para la gestión de perfiles se podrá simplificar el modelo omitiendo la entidad para perfil.
//	
//	public UsuariosService(){
//		
//		usuarios = new ArrayList<Usuario>();
//		
//		usuarios.add(new Usuario(1,"gallito", "1234", "Juan Manuel", "Gallo", "juanma@gmail.com", "10/10/1994",
//				"España", "Madrid", "gamer"));
//	}
	
	public Usuario validarUser(Login log){
		Usuario user = usuarioRepository.findByUserAndPass(log.getUser(), log.getPass());
		return user;
	}

}
