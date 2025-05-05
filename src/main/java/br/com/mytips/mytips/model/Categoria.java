package br.com.mytips.mytips.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name = "tb_categoria")
public class Categoria {

	@Id
	@SequenceGenerator(name = "sq_tb_categoria")
	@Column(name = "id_categoria")
	private Long id;

	@Column(name = "ds_nome")
	private String nome;

	@Column(name = "dt_inclusao")
	private Date dataInclusao;

	@Column(name = "id_usuario")
	private Long idUsuario;
}
