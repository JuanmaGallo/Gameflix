package es.urjc.etsii.Gameflix.msg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	private String user;
	private String pass;
	private String nombre;
	private String apellidos;
	private String correo;
	private String nacimiento;
	private String pais;
	private String residencia;
	private String perfil;
	
	public Usuario(){}

	public Usuario(String user, String pass, String nombre, String apellidos, String correo, String nacimiento,
			String pais, String residencia, String perfil) {
		super();
		this.user = user;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.nacimiento = nacimiento;
		this.pais = pais;
		this.residencia = residencia;
		this.perfil = perfil;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	

}
