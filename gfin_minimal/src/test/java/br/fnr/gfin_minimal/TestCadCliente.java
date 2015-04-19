package br.fnr.gfin_minimal;

import javax.inject.Inject;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.fnr.gfin_minimal.exception.ClienteException;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;


@RunWith(DemoiselleRunner.class)
public class TestCadCliente {

	@Inject
	CtrlCliente ctrlCliente;
	
	
	
	@Test
	public void cadastrarClienteComSucesso(){
		Cliente cliente = new Cliente();
		cliente.setCodigo(1000);
		cliente.setNome("Martins");
		cliente.setCnpj(12345678);
		cliente.setEndereco("rua a");

		ctrlCliente.cadastrar(cliente);
		
		Assert.assertTrue(ctrlCliente.estaCadastrado(cliente));
	}

	@Test(expected = ClienteException.class)
	public void falhaAoTentarCadastrarClienteDuplicado() {
			Cliente	cliente2 = new Cliente();
			cliente2.setCodigo(1);
			cliente2.setNome("Peter");
			cliente2.setCnpj(123456789);
			cliente2.setEndereco("rua b");

			ctrlCliente.cadastrar(cliente2);

			cliente2.setCodigo(1);
			cliente2.setNome("Elton");
			cliente2.setCnpj(12345678);
			cliente2.setEndereco("rua a");

			ctrlCliente.cadastrar(cliente2);
			//Assert.assertTrue(ctrlCliente.estaCadastrado(cliente2));

	}

}











