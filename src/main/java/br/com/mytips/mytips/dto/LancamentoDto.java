package br.com.mytips.mytips.dto;

import java.util.Date;

import lombok.Data;

@Data
public class LancamentoDto {
	private Long id;
	private char tipo;
	private Date dataReferencia;
	private String descricao;
	private Float valor;
	private Date dataLancamento;
	private Long idCategoria;
	private Long idConta;
}
