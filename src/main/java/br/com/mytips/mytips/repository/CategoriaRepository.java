package br.com.mytips.mytips.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mytips.mytips.model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

	List<Categoria> findAll();
}
