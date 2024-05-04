package br.edu.infnet.AppChristian.model.domain;

import java.util.List;

public class Biblioteca {
	
	public String nome;
	public String endereço;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public List<Livro> getLivro() {
		return Livro;
	}
	public void setLivro(List<Livro> livro) {
		Livro = livro;
	}
	public List<Livro> Livro;

}
