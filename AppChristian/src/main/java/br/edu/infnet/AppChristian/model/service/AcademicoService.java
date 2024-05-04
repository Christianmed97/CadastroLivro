package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Academico;
import br.edu.infnet.AppChristian.model.domain.Biblioteca;

@Service
public class AcademicoService {

	public static Map<Integer, Academico> mapa = new  HashMap<Integer, Academico>();
	public static int contador=0;
	
	public void incluir(Academico academico) {
		academico.setId(++contador);
		mapa.put(academico.getId(), academico);
	}
	public Collection<Academico> obterLista(){
		return mapa.values();
	}
}
