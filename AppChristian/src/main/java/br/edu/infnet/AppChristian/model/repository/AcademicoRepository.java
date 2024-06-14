package br.edu.infnet.AppChristian.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppChristian.model.domain.Academico;
import br.edu.infnet.AppChristian.model.domain.Biblioteca;

@Repository
public interface AcademicoRepository extends CrudRepository<Academico, Integer> {

}