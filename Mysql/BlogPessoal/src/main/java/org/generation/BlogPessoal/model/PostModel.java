package org.generation.BlogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity

@Table(name="tb_post")
public class PostModel {
	
	@Id //define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gera um valor estilo Auto_increment
	private long id; 
	
	@NotBlank //Nao aceita valores nullos 
	@Size(min = 3, max = 100)//Determina a quantidade max de caract...
	private String title;
	
	@NotBlank
	@Size(min = 3, max = 500)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP) //COMPLEMENTA O CALENDARIO
	private Date data = new java.sql.Date(System.currentTimeMillis());

	
	
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	

	
}
