package br.com.engsenai.ui;

import java.util.Scanner;
import br.com.engsenai.dao.*;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("---------------------------");
		System.out.println("Você chegou em uma boa hora, \nagora podemos calcular vários \npolígonos sem precisar reiniciar o programa:\n");
		System.out.println("1- Quadrado");
		System.out.println("2- Retângulo");
		System.out.println("3- Trapézio");
		System.out.println("4. Circunferência");
		System.out.println("5- Triângulo");
		System.out.println("6- Sair(NOVO)");
		System.out.println("---------------------------");
		System.out.print("Escolha uma opção (1-6): ");
		
		Scanner reader = new Scanner(System.in);
		int opcao = reader.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criarQuadrado();
		}
		else if (opcao == 2) {
			RetanguloDao.criarRetangulo();
		}
		
		else if (opcao == 3) {
			TrapezioDao.criarTrapezio();
		}
		
		else if (opcao == 4) {
			CirculoDao.criarCirculo();
		}
		
		else if (opcao == 5) {
			TrianguloDao.criarTriangulo();
		}
		
		else if (opcao == 6) {
			System.out.println("Encerrando...");
		}
		
		else{
			System.out.println("Essa função ainda não foi implementada");
		}
	}
	
	public static void continuar(Scanner reader) {
		
		String resposta = "";
		while (!resposta.equals("S") && !resposta.equals("N")) {
			System.out.println("---------------------------");
			System.out.println("Efetuar outro cálculo? \n(S/N)");
			System.out.println("---------------------------");
			
			resposta = reader.next();
			resposta = resposta.toUpperCase();
			
		}
		
		
		
		if (resposta.equals("S")) {
			Menu.mostrarMenu();
		}
		else{
			reader.close();
			System.out.println("Encerrando...");
		}
	}
	
	
	

}
