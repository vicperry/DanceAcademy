package br.com.vicperry.DanceAcademy.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Matricula {
	private String matricula;
	private boolean ativa;
	private LocalDateTime dataMatricula;
	private Aluno aluno;
	private List<Aula> aulas;
	public Matricula() {
		dataMatricula = LocalDateTime.now();
	}
	
	
	
	public Matricula(Aluno aluno, List<Aula> aulas) {
		this.aluno = aluno;
		this.aulas = aulas;
		
		dataMatricula = LocalDateTime.now();
	}

	public String obterLinha() {	
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/yyyy");
		
		return this.getDataMatricula().format(formato)+";"+
			this.getAluno()+";"+
			this.getAulas()+";"+
			this.getAulas().size()+"\r\n";
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtivo(boolean ativa) {
		this.ativa = ativa;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public List<Aula> getAulas() {
		return aulas;
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	public LocalDateTime getDataMatricula() {
		return dataMatricula;
	}
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s;%s;%s; \nTotal de aulas matriculadas: %s",
				matricula,
				ativa ? "ativa" : "trancada",
				dataMatricula.format(formato),
				aluno,
				aulas,
				aulas.size());
	}
	
	
}
