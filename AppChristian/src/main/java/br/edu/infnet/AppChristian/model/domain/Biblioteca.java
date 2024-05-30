package br.edu.infnet.AppChristian.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private int id;
	private String nome;
	private String endereco;
	
	public Biblioteca() {
		Livro = new ArrayList<Livro>();
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s - %s", id, nome,endereco,Livro);
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
		Livro = livro;
	}
	public List<Livro> Livro;

	public List<Livro> getLivro() {
		return Livro;
	}
	

}
