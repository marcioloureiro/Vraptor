package br.com.caelum.online.loja.controlador;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class IndexController {

	@Path("/")
	public void root() {
		System.out.println("Meu sistema com vraptor");
	}

}
