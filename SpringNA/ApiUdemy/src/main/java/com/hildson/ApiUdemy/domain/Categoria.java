package com.hildson.ApiUdemy.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


/* == INICIO --- SERIALIZABLE == */

@Entity
		public class Categoria implements Serializable {	
			private static final long serialVersionUID = 1L;
	
/* == FIM --- SERIALIZABLE == */
/* == INICIO --- ATRIBUTOS BASICOS DA CLASSE == */
			
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String nome;
		
/* == FIM --- ATRIBUTOS BASICOS DA CLASSE == */
/* == INICIO --- RELACIONAMENTO ENTRE TABELAS [MAPEAMENTO DO RELACIONAMENTO NO ENDPOINT PRODUTO] == */
		
		@ManyToMany(mappedBy = "categorias")
		
/* == FIM --- RELACIONAMENTO ENTRE TABELAS [MAPEAMENTO DO RELACIONAMENTO NO ENDPOINT PRODUTO] == */
		
		private List<Produto> produtos = new ArrayList<>();
		
/* == INICIO --- HASHCODE EGUALS == */		
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

/* == FIM --- HASHCODE EGUALS == */	
/* == INICIO --- MÉTODO VÁZIO == */
		
	public Categoria() {
	}

/* == FIM --- MÉTODO VÁZIO == */
/* == INICIO --- CONSTRUCTOR FIELDS == */
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
/* == FIM --- CONSTRUCTOR FIELDS == */
/* == INICIO --- GETTERS SETTERS == */
	
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
/* == FIM --- GETTERS SETTERS == */
	
}
