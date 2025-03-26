package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Retangulo;
import br.com.engsenai.ui.Menu;

public class RetanguloDao {
	public static void criarRetangulo() {
		//Instanciando
		Retangulo retangulo = new Retangulo();
		Scanner reader = new Scanner(System.in);

		//Comunicação com usuário
		System.out.println("\nCriando retangulo... ");

	
		//Recebendo base e altura
		
		System.out.println("Insira a base do retangulo: ");
		double base = (reader.nextDouble());
		
		System.out.println("Insira a altura do retangulo: ");
		double altura = (reader.nextDouble());
		
		//Repassando valores para o objeto
		retangulo.setLados(base, altura);
		
		
		//Print de informações
		retangulo.mostrarFicha();
		

		//Perguntando ao usuário se deseja continuar com a execução
		Menu.continuar(reader);

	}

}
