package com.sysbovino.entidades;
// Generated 07/10/2015 20:17:36 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;  
import javax.persistence.Entity;  
/**
 * Veterinario generated by hbm2java
 */
@Entity
@Table(name = "veterinario", catalog = "projetoSistemas")
public class Veterinario implements java.io.Serializable {

	private int codPessoa;
	private String crmv;

	public Veterinario() {
	}

	public Veterinario(int codPessoa, String crmv) {
		this.codPessoa = codPessoa;
		this.crmv = crmv;
	}

	@Id

	@Column(name = "cod_pessoa", unique = true, nullable = false)
	public int getCodPessoa() {
		return this.codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	@Column(name = "crmv", nullable = false, length = 50)
	public String getCrmv() {
		return this.crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

}