package exam.hibernate.dao;

import java.time.LocalTime;

import javax.persistence.*;

/**
 * DAO para la entidad eva_tch_notas_evaluacion
 *
 */
@Entity
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion")
public class Alumno {

	
	
	public Alumno(String md_uuid, LocalTime md_fch, String cod_alumno, int nota_evaluacion, String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.cod_alumno = cod_alumno;
		this.nota_evaualcion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}
	
	
	public Alumno() {
		super();
	}


	//ATRIBUTOS
	@Column(name="md_uuid")
	private String md_uuid;
	@Column(name="md_fch")
	private LocalTime md_fch;
	@Id
	@Column(name="id_nota_evaluacion", unique=true, nullable=false)
	private int id_nota_evaluacion;
	@Column(name="cod_alumno")
	private String cod_alumno;
	@Column(name="nota_evaluacion")
	private int nota_evaualcion;
	@Column(name="cod_evaluacion")
	private String cod_evaluacion;
	
	//GETTERS & SETTERS
	
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public LocalTime getMd_fch() {
		return md_fch;
	}
	public void setMd_fch(LocalTime md_fch) {
		this.md_fch = md_fch;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public int getNota_evaluacion() {
		return nota_evaualcion;
	}
	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaualcion = nota_evaluacion;
	}
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}
	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}


	@Override
	public String toString() {
		return "Alumno [cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaualcion + "]\n";
	}
	
	
	
}
