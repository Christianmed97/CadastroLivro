package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Biblioteca;
import br.edu.infnet.AppChristian.model.repository.BibliotecaRepository;

@Service
public class BibliotecaService {

	@Autowired
	public BibliotecaRepository bibliotecaRepository;
	
	public void incluir(Biblioteca biblioteca) {
		bibliotecaRepository.save(biblioteca);
	}
	public Collection<Biblioteca> obterLista(){
		return (Collection<Biblioteca>) bibliotecaRepository.findAll();
	}
	public Biblioteca obterPorId(Integer id) {
		return bibliotecaRepository.findById(id).orElse(null) ;
	}
	public void excluir(Integer id) {
		bibliotecaRepository.deleteById(id);
	}
	public long quantidade() {
		return bibliotecaRepository.count();
	}
}
