package br.fnr.gfin_minimal;

public class CadDocumento {
	private int codigo;
	private String descrição;
	private char abreviatura;
	private boolean status;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public char getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(char abreviatura) {
		this.abreviatura = abreviatura;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
