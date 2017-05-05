package model;

public class Pessoa {
	int id;
	String nome,
		data_nascimento,
		ccidadao;
	
	
	public Pessoa(int id, String nome, String data_nascimento, String ccidadao) {
		super();
		this.id = id;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.ccidadao = ccidadao;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getData_nascimento() {
		return data_nascimento;
	}


	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}


	public String getCcidadao() {
		return ccidadao;
	}


	public void setCcidadao(String ccidadao) {
		this.ccidadao = ccidadao;
	}
	
	

}
