package org.generation.BlogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name= "tb_tema")

public class Tema {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gera um valor estilo Auto_increment
	private long id;
	
	
	@NotNull
	@Size(min=4, max=100)
	private String descricao;


	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) /*um tema para varias postagens*/
	@JsonIgnoreProperties("tema")
	private List<PostModel> post;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public List<PostModel> getPost() {
		return post;
	}


	public void setPost(List<PostModel> post) {
		this.post = post;
	}


	public void setDescricao(String descrição) {
		this.descricao = descrição;
	}
	
	
	
	
}
