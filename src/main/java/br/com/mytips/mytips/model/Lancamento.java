package br.com.mytips.mytips.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name = "tb_lancamento")
public class Lancamento {

	@Id
	@SequenceGenerator(name = "sq_tb_lancamento")
	@Column(name = "id_lancamento")
	private Long id;

	@Column(name = "cd_tipo")
	private char tipo;

	@Column(name = "dt_referencia")
	private Date dataReferencia;

	@Column(name = "ds_descricao")
	private String descricao;

	@Column(name = "nr_valor")
	private Float valor;

	@Column(name = "dt_lancamento")
	private Date dataLancamento;

//	@ManyToOne(targetEntity = Categoria.class, fetch = FetchType.LAZY)
//	@JoinColumn(name="id_categoria", nullable = false)
//	private Categoria categoria;
	@Column(name = "id_categoria")
	private Long idCategoria;

	@Column(name = "id_conta")
	private Long idConta;
}
