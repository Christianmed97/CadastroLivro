package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Biblioteca;
import br.edu.infnet.AppChristian.model.domain.Literario;
import br.edu.infnet.AppChristian.model.domain.Livro;

@Service
public class LivroService {

	public static Map<Integer, Livro> mapa = new  HashMap<Integer, Livro>();
	public static int contador=0;
	
	public void incluir(Livro livro) {
		livro.setId(++contador);
		mapa.put(livro.getId(), livro);
	}
	public Collection<Livro> obterLista(){
		return mapa.values();
	}
	public Livro obterPorId(Integer id) {
		return mapa.get(id);
	}
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
