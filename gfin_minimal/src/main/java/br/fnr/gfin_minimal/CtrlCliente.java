package br.fnr.gfin_minimal;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.slf4j.Logger;

import br.fnr.gfin_minimal.exception.ClienteException;
import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.util.ResourceBundle;

public class CtrlCliente {

	private List<Cliente> listaCadCliente= new ArrayList<Cliente>();

	//injeçao do log
	@Inject
	private Logger logger;
	//private Logger logger = LoggerFactory.getLogger(br.edu.fnr.inscricao.Turma.class);

	@Inject
	private ResourceBundle bundle;



	@Name("capacidade.clientes")

	//get
	public List<Cliente> getListaCadCliente() {
		return listaCadCliente;
	}
	//set
	public void setListaCadCliente(List<Cliente> listaCadCliente) {
		this.listaCadCliente = listaCadCliente;
	}


	//metodos	

	public boolean estaCadastrado(Cliente cliente){
		//logger.info(""+cliente.getCodigo());
		//logger.info(""+cliente.equals(cliente.getCodigo()));S
		
		return listaCadCliente.contains(cliente);
	}



	public void cadastrar(Cliente cliente){
		
			logger.info("Preparando inclusao do cliente ...");
			//listaCadCliente.add(cliente);
			
			logger.info("Cliente "+cliente.getNome() +" sendo salvo ..."+listaCadCliente.size());

	
			//logger.info("boolean cliente cadastrado"+clienteCadastrado);


			if(estaCadastrado(cliente)){
				logger.info(bundle.getString("cliente.jacadastrado",cliente.getCodigo(),cliente.getNome()));
				throw new ClienteException();
				//foi implementado na excessao
				//logger.info(bundle.getString("cadastro.sucesso",cliente.getCodigo()));
				//logger.info(" cliente Salvo ...");
				
				
			}
			else{
				listaCadCliente.add(cliente);
			
			}




	}
	//fim
}

