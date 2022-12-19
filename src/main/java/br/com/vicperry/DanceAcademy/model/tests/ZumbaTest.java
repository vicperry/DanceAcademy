package br.com.vicperry.DanceAcademy.model.tests;

import br.com.vicperry.DanceAcademy.model.domain.Zumba;

public class ZumbaTest {

	public static void main(String[] args) {
		Zumba zumba1;
		try {
			zumba1 = new Zumba(1, 0, "Zyra", true, true, true);
			System.out.println(zumba1.toString());
			System.out.println(zumba1.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Zumba zumba2;
		try {
			zumba2 = new Zumba(3, 100, "Swain", false, false, false);
			System.out.println(zumba2.toString());
			System.out.println(zumba2.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Zumba zumba3;
		try {
			zumba3 = new Zumba(2, 100, "Ahri", true, true, false);
			System.out.println(zumba3.toString());
			System.out.println(zumba3.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
