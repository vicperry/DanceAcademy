package br.com.vicperry.DanceAcademy.model.tests;

import java.time.LocalDateTime;

import br.com.vicperry.DanceAcademy.model.domain.Aluno;

public class AlunoTest {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Pablo", LocalDateTime.of(1999, 1, 22, 0, 0), "pablo@gmail.com");
		System.out.println(aluno1.toString());
		
		Aluno aluno2 = new Aluno("Max", LocalDateTime.of(2001, 12, 15, 0, 0), "max@gmail.com");
		System.out.println(aluno2.toString());
		
		Aluno aluno3 = new Aluno("Freya", LocalDateTime.of(1996, 7, 02, 0, 0), "freya@gmail.com");
		System.out.println(aluno3.toString());
		
	}

}
