package br.com.dextraining.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Funcionario extends PessoaFisica {

	@OneToOne(cascade=CascadeType.REMOVE)
	private Usuario usuario;

	@Column
	private String matricula;

	@Column(precision = 2)
	private Double Salario;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
