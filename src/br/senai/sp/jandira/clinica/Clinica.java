package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {

		//Criação dos objetos do tipo paciente
			Paciente p1 = new Paciente();
			p1.nome = "Ana Maria";
			p1.setAltura(1.65);
			p1.dataNascimento = LocalDate.of(2003, 7, 29);
			p1.setPeso(45);
			p1.telefone = "(11)912345678";
			p1.estaInternado = true;
			
			
			Paciente p2 = new Paciente();
			p2.nome = "Julio Cesar";
			p2.setAltura(1.75);
			p2.dataNascimento = LocalDate.of(2008, 05, 28);
			p2.setPeso(72);
			p2.telefone = "(11)986484451";
			p2.estaInternado = false;
			
			//Mostrar dados do paciente 1
			p1.mostrarFichaPaciente();
			p2.mostrarFichaPaciente();
	}

}
