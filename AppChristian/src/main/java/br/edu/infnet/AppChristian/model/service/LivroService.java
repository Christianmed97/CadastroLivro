package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppChristian.model.domain.Livro;
import br.edu.infnet.AppChristian.model.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	public LivroRepository livroRepository;
	
	public void incluir(Livro livro) {
		livroRepository.save(livro);
	}
	public Collection<Livro> obterLista(){
		return (Collection<Livro>) livroRepository.findAll();
	}
	public Livro obterPorId(Integer id) {
		return livroRepository.findById(id).orElse(null);
	}
	public void excluir(Integer id) {
		livroRepository.deleteById(id);
	}
	public long quantidade() {
		return livroRepository.count();
	}
}
