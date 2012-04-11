package br.com.caelum.online.loja.controlador;

import java.util.List;

import br.com.caelum.online.loja.dao.ProdutoDao;
import br.com.caelum.online.loja.dominio.Produto;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutoController {

	private final ProdutoDao dao;
	private Result result;

	public ProdutoController(ProdutoDao dao, Result result) {
		this.result = result;
		this.dao = dao;
	}

	public void formulario() {

	}

	public List<Produto> lista() {
		return dao.listaTudo();
	}

	
	public void adiciona(Produto produto) {
		dao.salva(produto);
		result.redirectTo(ProdutoController.class).lista();
	}

	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}

	public Produto edita(Long id) {
		return dao.carrega(id);
	}

	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(ProdutoController.class).lista();
	}

}
