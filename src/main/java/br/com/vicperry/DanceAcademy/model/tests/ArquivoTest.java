package br.com.vicperry.DanceAcademy.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.vicperry.DanceAcademy.model.domain.Aluno;
import br.com.vicperry.DanceAcademy.model.domain.Aula;
import br.com.vicperry.DanceAcademy.model.domain.Ballet;
import br.com.vicperry.DanceAcademy.model.domain.HipHop;
import br.com.vicperry.DanceAcademy.model.domain.Matricula;
import br.com.vicperry.DanceAcademy.model.domain.Zumba;


public class ArquivoTest {

	public static void main(String[] args) {
		try {
			try {
				String arq = "matriculas.txt";
				
				FileReader fileR = new FileReader(arq);
				BufferedReader reader = new BufferedReader(fileR);
				
				FileWriter fileW = new FileWriter("out_" + arq);
				BufferedWriter writer = new BufferedWriter(fileW);
				
				String linha = reader.readLine();
				
				String[] campos = null;
				
				List<Aula> aulas = new ArrayList<Aula>();	
				Matricula m = null;

while(linha != null) {
					
					campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "M":
						try {
						m = new Matricula(new Aluno(campos[1], LocalDateTime.of(
								Integer.valueOf(campos[2]), 
								Month.valueOf(campos[3]),
								Integer.valueOf(campos[4]), 
								Integer.valueOf(campos[5]), 
								Integer.valueOf(campos[6])),
								campos[7]), aulas);
						m.setMatricula(campos[8]);
						m.setAtivo(Boolean.valueOf(campos[9]));
						
						}catch(Exception e) {
							e.printStackTrace();
						}
						
						writer.write(m.toString() + m.getAulas().toString() + "\r\n");

						break;
						
					case "B":
						
						Ballet b = new Ballet(Integer.valueOf(campos[1]),
								Float.valueOf(campos[2]),
								campos[3],
								Boolean.valueOf(campos[4]), 
								campos[5], 
								campos[6]);
						
						aulas.add(b);
						
						writer.write(b.toString() + "\r\n");

						break;

					case "H":						
						HipHop h = new HipHop(Integer.valueOf(campos[1]),
								Float.valueOf(campos[2]),
								campos[3],
								Boolean.valueOf(campos[4]), 
								campos[5], 
								Boolean.valueOf(campos[6]));
						
						aulas.add(h);
						
						writer.write(h.toString() + "\r\n");

						break;

					case "Z":						
						Zumba z = new Zumba(Integer.valueOf(campos[1]),
								Float.valueOf(campos[2]),
								campos[3],
								Boolean.valueOf(campos[4]), 
								Boolean.valueOf(campos[5]), 
								Boolean.valueOf(campos[6]));
						
						aulas.add(z);
						
						writer.write(z.toString() + "\r\n");

						break;
						
					default:
						System.out.println("Registro inválido [" + linha + "]");
						break;
					}

					linha = reader.readLine();
				}
				
				writer.write(m.obterLinha() + "\r\n");
								
				reader.close();
				fileR.close();
				
				writer.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}

		} finally {
			System.out.println("Processamento concluído com sucesso!");
		}			
	}

}
