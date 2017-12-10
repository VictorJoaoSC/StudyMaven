package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private byte idade;
	
	public Pessoa() {}
	
	public Pessoa(Integer id, String nome, byte idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	
	
}
