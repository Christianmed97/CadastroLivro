package br.edu.infnet.AppChristian.model.domain;

public class Literario extends Livro {
	
	public String tema;
	public boolean infantil;
	public String tipo;
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public boolean isInfantil() {
		return infantil;
	}
	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
