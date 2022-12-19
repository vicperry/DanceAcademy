package br.com.vicperry.DanceAcademy.model.domain;

import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroBalletException;
import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroHipHopException;
import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroZumbaException;

public abstract class Aula {
	protected int turno;
	protected float mensalidade;
	protected String nomeProfessor;
	
	public Aula(int turno, float mensalidade, String nomeProfessor) {
		this.turno = turno;
		this.mensalidade = mensalidade;
		this.nomeProfessor = nomeProfessor;
	}
	
	public abstract String calcularMensalidade() throws MensalidadeZeroBalletException, MensalidadeZeroHipHopException, MensalidadeZeroZumbaException;

	public int getTurno() {
		return turno;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Turno: " + turno + ";");
		sb.append("Mensalidade: R$" + mensalidade);
		sb.append("Professor: "+ nomeProfessor);
		
		return sb.toString();
	}
	
	
}
