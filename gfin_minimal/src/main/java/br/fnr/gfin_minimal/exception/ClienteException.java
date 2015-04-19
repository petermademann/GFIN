package br.fnr.gfin_minimal.exception;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.fnr.gfin_minimal.Cliente;
import br.gov.frameworkdemoiselle.util.ResourceBundle;

public class ClienteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//injeçao do log
	@Inject
	private Logger logger;

	//injeção da mensagem properties
	@Inject
	private ResourceBundle bundle;
	
	@Inject
	private Cliente cliente;

	public ClienteException() {
		super();


	}


	

}
