package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado;
	private double imc;
	
	
	public void setAltura(double altura) {
		if(altura>0){
			this.altura = altura;
		}else {
			System.out.println("A altura do paciente " + nome + " está incorreta!");
		}
		
		
	}
	
		public void setPeso(double peso ) {
			if(peso>=40) {
				this.peso = peso;
			}else {
				System.out.println("O peso do paciente " + nome + " está incorreto!");
			}
		}
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		imc = peso / Math.pow(altura, 2);
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaPaciente() {
		calcularImc();
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("altura: " + altura);
		System.out.println("IMC: " + imc);
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
