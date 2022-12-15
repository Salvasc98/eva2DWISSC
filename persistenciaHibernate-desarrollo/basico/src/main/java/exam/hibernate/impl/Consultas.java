package exam.hibernate.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import exam.hibernate.dao.Alumno;
import exam.hibernate.dao.AlumnoServicioImpl;
/**
 * Clase que agrupa las transacaciones contra base de datos.
 * La etiqueta autowired nos permite hacer inyección de dependencia de la clase
 * AlumnoServicioImpl.
 * La etiqueta Transactional automatiza la gestión de la transacción.
 *
 */
@Component
public class Consultas{

	@Autowired
	private AlumnoServicioImpl psi;
	
	@Transactional
	public void insertarUnPedido(Alumno pedido) {
		psi.insertarPedido(pedido);
	}
	
	@Transactional
	public void insertarListaPedidos(Collection<Alumno> colPedidos) {
		for (Alumno pedido : colPedidos) {
			psi.insertarPedido(pedido);
		}
	}
	
	@Transactional
	public List<Alumno> buscarUnAlumno(int i) {
		return psi.buscarUnAlumno(i);
	}
	
	@Transactional
	public List<Alumno> buscarTodosAlumno() {
		return psi.buscarTodos();
	}
	
}
