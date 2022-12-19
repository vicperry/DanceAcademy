package br.com.vicperry.DanceAcademy.model.tests;

import br.com.vicperry.DanceAcademy.model.domain.Ballet;

public class BalletTest {
	public static void main(String[] args) {
		
		Ballet ballet1;
		try {
			ballet1 = new Ballet(1, 0, "Tiesto", true, "Neoclássico", "Rosa");
			System.out.println(ballet1.toString());
			System.out.println(ballet1.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Ballet ballet2;
		try {
			ballet2 = new Ballet(3, 100, "Mara", false, "Jazz", "Bege");
			System.out.println(ballet2.toString());
			System.out.println(ballet2.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Ballet ballet3;
		try {
			ballet3 = new Ballet(2, 100, "Kiev", true, "Contemporâneo", "Branco");
			System.out.println(ballet3.toString());
			System.out.println(ballet3.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
