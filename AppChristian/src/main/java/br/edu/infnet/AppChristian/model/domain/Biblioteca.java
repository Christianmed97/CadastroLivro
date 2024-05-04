package br.edu.infnet.AppChristian.model.domain;

import java.util.List;

public class Biblioteca {
	
	private int id;
	private String nome;
	private String endereco;
	
	@Override
	public String toString() {
		return String.format("%s - %s", nome,endereco);
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
	public List<Livro> getLivro() {
		return Livro;
	}
	public void setLivro(List<Livro> livro) {
		Livro = livro;
	}
	public List<Livro> Livro;

}
