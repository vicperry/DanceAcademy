package br.com.vicperry.DanceAcademy.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluno {
	private String nome;
	private LocalDateTime dataNascimento;
	private String email;
	
	public Aluno(String nome, LocalDateTime dataNascimento, String email) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		StringBuilder sb = new StringBuilder();
		sb.append(nome + ";");
		sb.append(dataNascimento.format(formato) + ";");
		sb.append(email);
		
		return sb.toString();
	}
		
}
