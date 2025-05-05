package br.com.mytips.mytips.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mytips.mytips.model.Lancamento;

@Repository
public interface LancamentoRepository extends CrudRepository<Lancamento, Long> {

	List<Lancamento> findAll();
}
