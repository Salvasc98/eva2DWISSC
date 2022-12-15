package exam.hibernate.dao;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Component;

/**
 * Clase que implementa la interfaz AlumnoServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 *
 */
@Component
public class AlumnoServicioImpl implements AlumnoServicio{

	@PersistenceContext
	private EntityManager em;
	
	public void insertarPedido(Alumno alumno) {
		em.persist(alumno);
	}
	
	public List<Alumno> buscarUnAlumno(int i) {
		return em.createQuery("SELECT alumnos FROM Alumno alumnos Where id_nota_evaluacion = " + i).getResultList();
	}
	
	public List<Alumno> buscarTodos() {
		return em.createQuery("SELECT alumnos FROM Alumno alumnos").getResultList();
	}

}
