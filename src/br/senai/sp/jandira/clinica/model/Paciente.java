package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public LocalDate dataNascimento;
	public double peso;
	public double altura;
	public String telefone;
	public boolean estaInternado;
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaPaciente() {
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("altura: " + altura);
		System.out.println("telefone: " + telefone);
		System.out.println("dataNascimento: " + dataNascimento);
		System.out.println("Dia nasc: " + exibirDiaSemanaNascimento());
		System.out.println("Internado: " + estaInternado);
		System.out.println("------------------------");
	}
	
	public String exibirDiaSemanaNascimento() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();	
		return diaSemana;
	}
}
