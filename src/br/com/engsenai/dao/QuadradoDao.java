package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Quadrado;

public class QuadradoDao {
	public static void criarQuadrado() {
		//Instanciando
		Quadrado quadrado = new Quadrado();
		Scanner reader = new Scanner(System.in);

		//Comunicação com usuário
		System.out.println("\nCriando quadrado... ");
		System.out.println("Insira o lado do quadrado: ");
	
		//Recebendo lado
		quadrado.setLado(reader.nextDouble());
		
		//Print de informações do quadrado
		quadrado.mostrarFicha();
		
		//Encerrando o reader
		reader.close();
	}

}
