package br.com.caelum.online.loja.repositorio;

import java.util.List;

import br.com.caelum.online.loja.dominio.Produto;

public interface RepositorioDeProdutos {

	void salva(Produto produto);
	List<Produto> pegaTodos();
	void remove(Produto produto);
	Produto pegaPorId(Long id);
}
