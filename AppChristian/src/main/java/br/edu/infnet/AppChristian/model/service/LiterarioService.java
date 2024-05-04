package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Biblioteca;
import br.edu.infnet.AppChristian.model.domain.Literario;

@Service
public class LiterarioService {

	public static Map<Integer, Literario> mapa = new  HashMap<Integer, Literario>();
	public static int contador=0;
	
	public void incluir(Literario literario) {
		literario.setId(++contador);
		mapa.put(literario.getId(), literario);
	}
	public Collection<Literario> obterLista(){
		return mapa.values();
	}
}
