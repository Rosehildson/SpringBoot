package com.hildson.ApiUdemy.domain;

public class Categoria {

/* === INCLUIDOS OS ATRIBUTOS BASICOS DA CLASSE === */
		private Integer id;
		private String nome;
		
/* === CRIANDO O MÉTODO VÁZIO === */
	public Categoria() {
	}
	
/* === SOURCES/CONSTRUCTOR USING FIELDS ===*/
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

/* === SOURCES/GETTERS AND SETTERS === */
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
