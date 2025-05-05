package br.com.mytips.mytips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mytips.mytips.model.Lancamento;
import br.com.mytips.mytips.repository.LancamentoRepository;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public List<Lancamento> findAll() {
		return this.lancamentoRepository.findAll();
	}
}
