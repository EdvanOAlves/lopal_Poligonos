package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Triangulo;

public class TrianguloDao {
	public static void criarTriangulo() {
		//Instanciando
		Triangulo triangulo= new Triangulo();
		Scanner reader = new Scanner(System.in);

		//Comunicação com usuário
		System.out.println("\nCriando retangulo... ");

	
		//Recebendo base e altura
		
		System.out.println("Insira a base do triangulo: ");
		double base = (reader.nextDouble());
		
		System.out.println("Insira a altura do triangulo: ");
		double altura = (reader.nextDouble());
		
		//Repassando valores para o objeto
		triangulo.setLados(base, altura);
		
		
		//Print de informações
		triangulo.mostrarFicha();
		
		//Encerrando o reader
		reader.close();
	}
}
