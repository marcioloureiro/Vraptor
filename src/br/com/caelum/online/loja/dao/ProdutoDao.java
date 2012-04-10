package br.com.caelum.online.loja.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.caelum.online.loja.dominio.Produto;
import br.com.caelum.online.loja.repositorio.RepositorioDeProdutos;

public class ProdutoDao implements RepositorioDeProdutos {

	private final static List<Produto> PRODUTOS = new ArrayList<Produto>();
	
	static {
		populaProdutosIniciais();
	}
	
	public void salva(Produto produto) {
		produto.setId(PRODUTOS.size() +1l);
		PRODUTOS.add(produto);
	}

	public List<Produto> pegaTodos() {
		return Collections.unmodifiableList(PRODUTOS);
	}

	public void remove(Produto produto) {
		Iterator<Produto> it = PRODUTOS.iterator();
		while(it.hasNext()) {
			Produto existente = it.next();
			if(existente.getId().equals(produto.getId())) {
				it.remove();
				break;
			}
		}
	}

	private static void populaProdutosIniciais() {
		PRODUTOS.add(new Produto(1l, "iPod", "tocador de mp3 da apple", 299.90,"preto"));
		PRODUTOS.add(new Produto(2l, "iPad", "tablet da apple", 1999.99,"branco"));
		PRODUTOS.add(new Produto(3l, "212 for women", "perfume da carolina herrera", 67.80,"verde"));
		PRODUTOS.add(new Produto(4l, "Ivete Sangalo Ao Vivo", "cd da cantora", 29.90,"amarelo"));
	}

	public Produto pegaPorId(Long id) {
		for(Produto produto : PRODUTOS) {
			if(produto.getId().equals(id)) return produto;
		}
		return null;
	}

}
