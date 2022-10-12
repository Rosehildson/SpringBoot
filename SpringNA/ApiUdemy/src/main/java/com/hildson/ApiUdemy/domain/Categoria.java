package com.hildson.ApiUdemy.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
		public class Categoria implements Serializable {	
			private static final long serialVersionUID = 1L;
	
/* === INCLUIDOS OS ATRIBUTOS BASICOS DA CLASSE === */
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String nome;
		
/* === INCLUIDOS OS HASHCODE() AND EGUALS() === */		
@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Categoria other = (Categoria) obj;
			return Objects.equals(id, other.id);
		}

/* === INCLUIDO O MÉTODO VÁZIO === */
	public Categoria() {
	}
	
/* === INCLUIDOS OS CONSTRUCTOR USING FIELDS ===*/
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

/* === INCLUIDOS OS GETTERS AND SETTERS === */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
