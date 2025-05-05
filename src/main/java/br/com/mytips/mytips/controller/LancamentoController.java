package br.com.mytips.mytips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mytips.mytips.model.Lancamento;
import br.com.mytips.mytips.service.LancamentoService;

@RestController()
@RequestMapping("/api/lancamentos")
public class LancamentoController {

	@Autowired
	private LancamentoService lancamentoService;
	
	@GetMapping
	public List<Lancamento> findAll() {
		return this.lancamentoService.findAll();
	}
}
