package com.sysbovino.entidades;
// Generated 07/10/2015 20:17:36 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;  
import javax.persistence.Entity;  

/**
 * PessoaJuridica generated by hbm2java
 */
@Entity
@Table(name = "pessoa_juridica", catalog = "projetoSistemas")
public class PessoaJuridica implements java.io.Serializable {

	private int codPessoa;
	private String numCnpj;
	private String inscricaoEstadual;
	private String razaoSocial;

	public PessoaJuridica() {
	}

	public PessoaJuridica(int codPessoa, String numCnpj, String inscricaoEstadual) {
		this.codPessoa = codPessoa;
		this.numCnpj = numCnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public PessoaJuridica(int codPessoa, String numCnpj, String inscricaoEstadual, String razaoSocial) {
		this.codPessoa = codPessoa;
		this.numCnpj = numCnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
	}

	@Id

	@Column(name = "cod_pessoa", unique = true, nullable = false)
	public int getCodPessoa() {
		return this.codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	@Column(name = "num_cnpj", nullable = false, length = 20)
	public String getNumCnpj() {
		return this.numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}

	@Column(name = "inscricao_estadual", nullable = false, length = 15)
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Column(name = "razao_social", length = 20)
	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
