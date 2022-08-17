package com.generation.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=5)
	private String acao;
	
	@NotBlank
	@Size(min=5)
	private String corrida;
	
	@NotBlank
	@Size(min=5)
	private String educacional;
	

	@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getCorrida() {
		return corrida;
	}

	public void setCorrida(String corrida) {
		this.corrida = corrida;
	}

	public String getEducacional() {
		return educacional;
	}

	public void setEducacional(String educacional) {
		this.educacional = educacional;
	}

}
