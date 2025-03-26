package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Circulo;
import br.com.engsenai.ui.Menu;

public class CirculoDao {
	public static void criarCirculo() {
		//Instanciando
		Circulo circulo = new Circulo();
		Scanner reader = new Scanner(System.in);
	
		//Comunicação com usuário
		System.out.println("\nCriando circulo... ");
		System.out.println("Insira o raio do circulo: ");
	
		//Recebendo raio
		circulo.setRaio(reader.nextDouble());
		
		//Print de informações do circulo
		circulo.mostrarFicha();
		
		//Encerrando o reader
		//reader.close();
		

		//Perguntando ao usuário se deseja continuar com a execução
		Menu.continuar(reader);
	}

}
