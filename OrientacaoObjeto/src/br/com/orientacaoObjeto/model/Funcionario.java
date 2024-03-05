package br.com.orientacaoObjeto.model;

public class Funcionario extends Pessoa {
	
	int matricula;
	String setor;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String setor) {
		super();
		this.matricula = matricula;
		this.setor = setor;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	

}
