package br.com.caelum.online.loja.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSession implements ComponentFactory<Session>{
	
	private final SessionFactory factory;
	
	public CriadorDeSession(SessionFactory factory){
		this.factory = factory;
	}
	
	public Session getInstance() {
		return factory.openSession();
	}
	
//	public static Session getSession() {
//		
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		return session;
//		
//	}
	
}
