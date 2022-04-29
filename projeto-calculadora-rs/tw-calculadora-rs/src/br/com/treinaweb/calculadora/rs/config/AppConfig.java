package br.com.treinaweb.calculadora.rs.config;

import org.glassfish.jersey.server.ResourceConfig;

import br.com.treinaweb.calculadora.rs.controllers.SomadorController;

public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(SomadorController.class);
	}
}
