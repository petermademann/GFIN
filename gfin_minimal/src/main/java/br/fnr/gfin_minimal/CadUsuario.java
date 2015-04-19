package br.fnr.gfin_minimal;

import javax.inject.Inject;

import org.slf4j.Logger;

public class CadUsuario {

	
private int codigo; 
private String	nome; 
private String senha; // rever com o professor a segurança;

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

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}


}
