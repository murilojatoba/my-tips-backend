package br.com.mytips.mytips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mytips.mytips.model.Categoria;
import br.com.mytips.mytips.service.CategoriaService;

@RestController()
@RequestMapping("/api/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public List<Categoria> findAll() {
		return this.categoriaService.findAll();
	}
}
