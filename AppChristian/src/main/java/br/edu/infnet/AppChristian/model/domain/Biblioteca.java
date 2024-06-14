package br.edu.infnet.AppChristian.model.domain;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tabelaBiblioteca")
public class Biblioteca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String endereco;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name= "id_livro")
	public List<Livro> livros;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}
	
	public Biblioteca(Integer id) {
		this();
		this.setId(id);
	}

	@Override
	public String toString() {
		return String.format("%d - %s - %s - %s", id, nome,endereco,livros);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereço) {
		this.endereco = endereço;
	}
	
	public void setLivro(List<Livro> livro) {
		this.livros = livro;
	}
	

	public List<Livro> getLivro() {
		return this.livros;
	}
	

}
