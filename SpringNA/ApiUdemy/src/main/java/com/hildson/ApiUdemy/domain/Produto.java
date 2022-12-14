package com.hildson.ApiUdemy.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Produto implements Serializable {	
	private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String nome;
		private Double preco;
	
/* == INICIO --- RELACIONAMENTO ENTRE TABELAS [PRIMARY KEY AND FOREIGN KEY] ==*/	
		
		@JsonBackReference			//busca a referĂȘncia do endpoint categoria, caso consultado la, entao desconsiderar essa consulta daqui.
		@ManyToMany					//referĂȘncia de relaciomentamento MUITOS PARA MUITOS.
		@JoinTable(name = "PRODUTO_CATEGORIA",
		joinColumns = @JoinColumn(name = "produto_id"),
		inverseJoinColumns = @JoinColumn(name = "categoria_id")
		)
		
/* == FIM --- RELACIONAMENTO ENTRE TABELAS [PRIMARY KEY AND FOREIGN KEY] ==*/
		
		private List<Categoria> categorias = new ArrayList<>();
		
		
/* == INCIO --- METODO VAZIO ==*/
		
		public Produto() {		
		}
		
/* == FIM --- METODO VAZIO ==*/
/* == INICIO --- CONSTRUCTOR FIELDS == */
		
		public Produto(Integer id, String nome, Double preco) {
			super();
			this.id = id;
			this.nome = nome;
			this.preco = preco;
		}
		
/* == FIM --- CONSTRUCTOR FIELDS == */
/* == INCIO --- GETTERS SETTERS == */		
		
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

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}

		public List<Categoria> getCategorias() {
			return categorias;
		}

		public void setCategorias(List<Categoria> categorias) {
			this.categorias = categorias;
		}

/* == FIM --- GETTERS SETTERS == */
/* == INCIO --- HASHCODE EQUALS	== */
		
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
			Produto other = (Produto) obj;
			return Objects.equals(id, other.id);
		}
		
/* == FIM --- HASHCODE EQUALS	== */
		
}
