package br.com.caelum.online.loja.infra;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSessionFactory implements
		ComponentFactory<SessionFactory> {

	public SessionFactory getInstance() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}

}
