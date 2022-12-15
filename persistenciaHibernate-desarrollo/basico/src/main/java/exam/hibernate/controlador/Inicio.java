package exam.hibernate.controlador;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import java.time.*;
import java.time.format.*;

import exam.hibernate.dao.Alumno;
import exam.hibernate.impl.Consultas;

@Controller
public class Inicio {

	
	public static void main(String[] args) { 
		
		LocalTime md_fch = LocalTime.now();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		//consulta.insertarUnPedido(new Alumno("9", md_fch, "pruebaJava", 8, "PR"));
		System.out.println("Lista alumnos: " + consulta.buscarTodosAlumno());
		System.out.println("Lista alumno: " + consulta.buscarUnAlumno(6));
	    
	}


}
