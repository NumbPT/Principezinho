package model;

public class Crianca extends Pessoa {
	
	String observacoes;
	
	public Crianca(int id, String nome, String data_nascimento, String ccidadao, String observacoes) {
		super(id, nome, data_nascimento, ccidadao);
		// TODO Auto-generated constructor stub
		this.observacoes = observacoes;	
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	
	
	
	
}