package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Biblioteca;

@Service
public class BibliotecaService {

	public static Map<Integer, Biblioteca> mapa = new  HashMap<Integer, Biblioteca>();
	public static int contador=0;
	
	public void incluir(Biblioteca biblioteca) {
		biblioteca.setId(++contador);
		mapa.put(biblioteca.getId(), biblioteca);
	}
	public Collection<Biblioteca> obterLista(){
		return mapa.values();
	}
	public Biblioteca obterPorId(Integer id) {
		return mapa.get(id);
	}
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
