package br.com.mytips.mytips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mytips.mytips.model.Categoria;
import br.com.mytips.mytips.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> findAll() {
		return this.categoriaRepository.findAll();
	}
}
