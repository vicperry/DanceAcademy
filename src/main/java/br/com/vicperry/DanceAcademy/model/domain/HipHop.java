package br.com.vicperry.DanceAcademy.model.domain;

import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroHipHopException;

public class HipHop extends Aula {
	
	private boolean nivelProfissional;
	private String modalidadeHipHop;
	private boolean aoArLivre;

	public HipHop(int turno, float mensalidade, String nomeProfessor, boolean nivelProfissional,
			String modalidadeHipHop, boolean aoArLivre) {
		super(turno, mensalidade, nomeProfessor);
		this.nivelProfissional = nivelProfissional;
		this.modalidadeHipHop = modalidadeHipHop;
		this.aoArLivre = aoArLivre;
	}

	public boolean isNivelProfissional() {
		return nivelProfissional;
	}

	public void setNivelProfissional(boolean nivelProfissional) {
		this.nivelProfissional = nivelProfissional;
	}
	
	public String getModalidadeHipHop() {
		return modalidadeHipHop;
	}

	public void setModalidadeHipHop(String modalidadeHipHop) {
		this.modalidadeHipHop = modalidadeHipHop;
	}

	public boolean isAoArLivre() {
		return aoArLivre;
	}

	public void setAoArLivre(boolean aoArLivre) {
		this.aoArLivre = aoArLivre;
	}

	@Override
	public String calcularMensalidade() throws MensalidadeZeroHipHopException {
		try {
			if (mensalidade > 0) {
				if(nivelProfissional) {
					float novaMensalidade = mensalidade * 2;
					return "R$" + novaMensalidade;
				}
				return "R$" + mensalidade;
			} else {
				throw new MensalidadeZeroHipHopException("Mensalidade inválida. Insira apenas valores positivos não nulos.");
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String toString() {
		return super.toString() + ";Nível Profissional: " + nivelProfissional
				+ ";Modalidade Hip-Hop: " + modalidadeHipHop
				+ ";Ao ar livre: " + aoArLivre;
	}
	
	

}
