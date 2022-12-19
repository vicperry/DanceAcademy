package br.com.vicperry.DanceAcademy.model.domain;

import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroBalletException;

public class Ballet extends Aula {

	private boolean turmaAvancada;
	private String modalidadeBallet;
	private String corCollant;

	
	public Ballet(int turno, float mensalidade, String nomeProfessor, boolean turmaAvancada, String modalidadeBallet,
			String corCollant) {
		super(turno, mensalidade, nomeProfessor);
		this.turmaAvancada = turmaAvancada;
		this.modalidadeBallet = modalidadeBallet;
		this.corCollant = corCollant;
	}

	public String getModalidadeBallet() {
		return modalidadeBallet;
	}

	public void setModalidadeBallet(String modalidadeBallet) {
		this.modalidadeBallet = modalidadeBallet;
	}

	public String getCorCollant() {
		return corCollant;
	}

	public void setCorCollant(String corCollant) {
		this.corCollant = corCollant;
	}

	public boolean isTurmaAvancada() {
		return turmaAvancada;
	}

	public void setTurmaAvancada(boolean turmaAvancada) {
		this.turmaAvancada = turmaAvancada;
	}

	@Override
	public String calcularMensalidade() throws MensalidadeZeroBalletException {
		try {
			if (mensalidade > 0) {
			if (turmaAvancada) {
					float novaMensalidade = mensalidade * 2;
					return "R$" + novaMensalidade;
				}
				return "R$" + mensalidade;
			} else {
				throw new MensalidadeZeroBalletException("Mensalidade inválida. Insira apenas valores positivos não nulos.");
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String toString() {
		return super.toString() + ";Turma Avançada:" + turmaAvancada
				+ ";Modalidade:" + modalidadeBallet
				+ ";corCollant:" + corCollant;
	}

}
