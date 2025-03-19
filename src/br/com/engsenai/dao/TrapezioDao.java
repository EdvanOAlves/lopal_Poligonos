package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Trapezio;

public class TrapezioDao {
	public static void criarTrapezio() {
		//Instanciando
		Trapezio trapezio = new Trapezio();
		Scanner reader = new Scanner(System.in);

		//Comunicação com usuário
		System.out.println("\nCriando trapézio... ");
	
		//Recebendo baseMenor, baseMaior e altura
		
		System.out.println("Insira a base menor: ");
		double baseMenor = (reader.nextDouble());
		
		System.out.println("Insira a base maior: ");
		double baseMaior = (reader.nextDouble());
		
		System.out.println("Insira a altura: ");
		double altura = (reader.nextDouble());
		
		//Repassando valores para o objeto
		trapezio.setLados(baseMenor, baseMaior, altura);
		
		
		//Print de informações
		trapezio.mostrarFicha();
		
		//Encerrando o reader
		reader.close();
	}

}
