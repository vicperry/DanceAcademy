package br.com.vicperry.DanceAcademy.model.domain;

import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroZumbaException;

public class Zumba extends Aula {
	
	private boolean turmaUnissex;
	private boolean aoArLivre;
	private boolean semImpacto;

	public Zumba(int turno, float mensalidade, String nomeProfessor, boolean turmaUnissex, boolean aoArLivre,
			boolean semImpacto) {
		super(turno, mensalidade, nomeProfessor);
		this.turmaUnissex = turmaUnissex;
		this.aoArLivre = aoArLivre;
		this.semImpacto = semImpacto;
	}

	public boolean isTurmaUnissex() {
		return turmaUnissex;
	}

	public void setTurmaUnissex(boolean turmaUnissex) {
		this.turmaUnissex = turmaUnissex;
	}
	
	public boolean isAoArLivre() {
		return aoArLivre;
	}

	public void setAoArLivre(boolean aoArLivre) {
		this.aoArLivre = aoArLivre;
	}

	public boolean isSemImpacto() {
		return semImpacto;
	}

	public void setSemImpacto(boolean semImpacto) {
		this.semImpacto = semImpacto;
	}

	@Override
	public String calcularMensalidade() throws MensalidadeZeroZumbaException {
		try {
			if (mensalidade > 0) {
				if(turmaUnissex) {
					float novaMensalidade = (float) (mensalidade - (mensalidade * 0.2));
					return "R$" + novaMensalidade;
				}
				
				return "R$" + mensalidade;
			} else {
				throw new MensalidadeZeroZumbaException("Mensalidade inválida. Insira apenas valores positivos não nulos.");
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String toString() {
		return super.toString() + turmaUnissex
				 + aoArLivre + ";"
				 + semImpacto + ";";
	}
	
	

}
