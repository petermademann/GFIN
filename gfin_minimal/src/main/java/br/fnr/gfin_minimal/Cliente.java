package br.fnr.gfin_minimal;

import javax.inject.Inject;

import org.slf4j.Logger;


public class Cliente {


	private int codigo;
	private String nome;
	private double cnpj;
	private String endereco;
	public CtrlCliente ctrlcliente;

	//injeçao do log
	@Inject
	private Logger logger;





	// Metodos

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public boolean equals(Object objectCliente) {
		if (objectCliente instanceof Cliente) {
			Cliente outroCliente = (Cliente) objectCliente;
			return outroCliente.codigo ==this.codigo;
		} else {
			return false;
		}
	}
}
