package br.edu.infnet.AppChristian.model.domain;

public class Literario extends Livro {
	
	private String tema;
	private boolean infantil;
	private String tipo;
	
	public String toString() {
		 return String.format("%s - %s - %s - %s",super.toString(), tema,infantil,tipo);
	}
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
