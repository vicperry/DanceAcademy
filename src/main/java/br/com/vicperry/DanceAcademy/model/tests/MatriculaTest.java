package br.com.vicperry.DanceAcademy.model.tests;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.vicperry.DanceAcademy.model.domain.Aluno;
import br.com.vicperry.DanceAcademy.model.domain.Aula;
import br.com.vicperry.DanceAcademy.model.domain.Ballet;
import br.com.vicperry.DanceAcademy.model.domain.HipHop;
import br.com.vicperry.DanceAcademy.model.domain.Matricula;
import br.com.vicperry.DanceAcademy.model.domain.Zumba;
import br.com.vicperry.DanceAcademy.model.exceptions.MensalidadeZeroBalletException;

public class MatriculaTest {

	public static void main(String[] args) {
		
		//Alunos
		Aluno aluno1 = new Aluno("Pablo", LocalDateTime.of(1999, 1, 22, 0, 0), "pablo@gmail.com");
		System.out.println(aluno1.toString());
		
		Aluno aluno2 = new Aluno("Max", LocalDateTime.of(2001, 12, 15, 0, 0), "max@gmail.com");
		System.out.println(aluno2.toString());
		
		Aluno aluno3 = new Aluno("Freya", LocalDateTime.of(1996, 7, 02, 0, 0), "freya@gmail.com");
		System.out.println(aluno3.toString());
		
		//Aulas
		Aula ballet2 = null;
		try {
			ballet2 = new Ballet(3, 100, "Mara", false, "Jazz", "Bege");
			System.out.println(ballet2.toString());
			System.out.println(ballet2.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Aula hiphop2 = null;
		try {
			hiphop2 = new HipHop(3, 100, "Drake", false, "Popping", true);
			System.out.println(hiphop2.toString());
			System.out.println(hiphop2.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Aula zumba2 = null;
		try {
			zumba2 = new Zumba(3, 100, "Swain", false, false, false);
			System.out.println(zumba2.toString());
			System.out.println(zumba2.calcularMensalidade());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Matrícula
		//Matrícula 1
		Matricula mat1 = new Matricula();
		mat1.setMatricula("001");
		mat1.setAtivo(true);
		mat1.setAluno(aluno1);
		
		List<Aula> aulas1 = new ArrayList<Aula>();		
		aulas1.add(ballet2);
		aulas1.add(hiphop2);
		aulas1.add(zumba2);
		mat1.setAulas(aulas1);

		System.out.println(mat1.toString());
		
		//Matrícula 2
		Matricula mat2 = new Matricula();
		mat2.setMatricula("002");
		mat2.setAtivo(true);
		mat2.setAluno(aluno2);
		
		List<Aula> aulas2 = new ArrayList<Aula>();		
		aulas2.add(ballet2);
		mat2.setAulas(aulas2);

		System.out.println(mat2.toString());
		
		//Matrícula 3
		Matricula mat3 = new Matricula();
		mat3.setMatricula("003");
		mat3.setAtivo(true);
		mat3.setAluno(aluno3);
		
		List<Aula> aulas3 = new ArrayList<Aula>();		
		mat3.setAulas(aulas3);

		System.out.println(mat3.toString());
	}

}
