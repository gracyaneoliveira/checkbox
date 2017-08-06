package com.projeto.model;

import java.io.Serializable;

public class City extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private int codigo;
	private String nome;

	public City() {
	}
	
	public City(String nome,Long id) {
		this.nome = nome;
		setId(id);
	}

	
//	public int getCodigo() {
//		return codigo;
//	}
//
//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}
//
//	public void setId(int id) {
//		this.codigo = id;
//	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
