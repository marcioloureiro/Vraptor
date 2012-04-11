package br.com.caelum.online.loja.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.online.loja.dominio.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao {

	private Session session;

	public ProdutoDao(Session session) {
		this.session = session;
	}

	public void salva(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listaTudo() {
		return session.createCriteria(Produto.class).list();
	}

	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();
	}

	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.update(produto);
		tx.commit();

	}

	public Produto carrega(Long id) {
		return (Produto) this.session.load(Produto.class, id);
	}

}
