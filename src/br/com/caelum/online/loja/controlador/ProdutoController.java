package br.com.caelum.online.loja.controlador;

import java.util.List;

import br.com.caelum.online.loja.dao.ProdutoDao;
import br.com.caelum.online.loja.dominio.Produto;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutoController {
	
	private final ProdutoDao produtos;
	private Result result;
	
	public ProdutoController(Result result) {
		this.result=result;
		this.produtos = new ProdutoDao();
	}
	
	public List<Produto> lista(){
		return produtos.pegaTodos();
	}
	
	public void formulario(){
		
	}
	
	@Post
	public void adiciona(Produto produto ){
		produtos.salva(produto);
	}
	
	@Path("/produto/{id}")
	public Produto exibe(Long id){
		return produtos.pegaPorId(id);
	}
}
