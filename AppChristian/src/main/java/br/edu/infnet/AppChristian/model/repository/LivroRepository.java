package br.edu.infnet.AppChristian.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppChristian.model.domain.Academico;
import br.edu.infnet.AppChristian.model.domain.Biblioteca;
import br.edu.infnet.AppChristian.model.domain.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer> {

}