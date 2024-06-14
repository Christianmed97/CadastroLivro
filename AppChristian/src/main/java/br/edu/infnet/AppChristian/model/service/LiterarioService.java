package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Literario;
import br.edu.infnet.AppChristian.model.repository.LiterarioRepository;

@Service
public class LiterarioService {

	@Autowired
	public LiterarioRepository literarioRepository;
	
	public void incluir(Literario literario) {
		literarioRepository.save(literario);
	}
	public Collection<Literario> obterLista(){
		return (Collection<Literario>) literarioRepository.findAll();
	}
	public Literario obterPorId(Integer id) {
		return literarioRepository.findById(id).orElse(null);
	}
	public void excluir(Integer id) {
		literarioRepository.deleteById(id);
	}
	public long quantidade() {
		return literarioRepository.count();
	}
}