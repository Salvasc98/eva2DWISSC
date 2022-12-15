package exam.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

/**
 * Interfaz que actúa sobre AlumnoDao
 * Tan solo se define la signatura de los métodos que actuarán sobre
 * AlumnoDao, la implementación se define en AlumnoServicioImpl
 *
 */
public interface AlumnoServicio {
	
	/**
	 * Método que inserta un nuevo alumno en base de datos.
	 * @param pedido
	 */
	public void insertarPedido(Alumno alumno);
	
	/**
	 * Método que trae un registro de la tabla eva_tch_notas_evaluacion
	 * @return
	 */
	public List<Alumno> buscarUnAlumno(int i);
	
	/**
	 * Método que trae todos los registros de la tabla eva_tch_notas_evaluacion
	 * @return
	 */
	
	public List<Alumno> buscarTodos();

}
