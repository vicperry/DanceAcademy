package br.com.vicperry.DanceAcademy.model.tests;

import br.com.vicperry.DanceAcademy.model.domain.HipHop;

public class HipHopTest {

	public static void main(String[] args) {
		
		HipHop hiphop1;
		try {
			hiphop1 = new HipHop(1, 0, "Chris Brown", true, "Breaking", true);
			System.out.println(hiphop1.toString());
			System.out.println(hiphop1.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		HipHop hiphop2;
		try {
			hiphop2 = new HipHop(3, 100, "Drake", false, "Popping", true);
			System.out.println(hiphop2.toString());
			System.out.println(hiphop2.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		HipHop hiphop3;
		try {
			hiphop3 = new HipHop(2, 100, "Nicki Minaj", true, "Locking", false);
			System.out.println(hiphop3.toString());
			System.out.println(hiphop3.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
