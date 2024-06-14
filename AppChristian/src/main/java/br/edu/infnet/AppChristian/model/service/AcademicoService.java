package br.edu.infnet.AppChristian.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppChristian.model.domain.Academico;
import br.edu.infnet.AppChristian.model.repository.AcademicoRepository;

@Service
public class AcademicoService {

	@Autowired
	public AcademicoRepository academicoRepository;
	
	public void incluir(Academico academico) {
		academicoRepository.save(academico);
	}
	public Collection<Academico> obterLista(){
		return (Collection<Academico>) academicoRepository.findAll();
	}
	public Academico obterPorId(Integer id) {
		return academicoRepository.findById(id).orElse(null);
	}
	public void excluir(Integer id) {
		academicoRepository.deleteById(id);
	}
	public long quantidade() {
		return academicoRepository.count();
	}
}
