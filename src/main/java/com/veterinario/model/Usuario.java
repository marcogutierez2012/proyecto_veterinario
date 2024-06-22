package com.veterinario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre", nullable= false)
	private String nombre;
	@Column(name="apellido", nullable= false)
	private String apellido;
	@Column(name="correo", nullable= false, unique= true)
	private String correo;
	@Column(name="telefono", nullable= false, unique= true)
	private String telefono;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="rol_id")
	private Rol rol;
	
	
	
}
