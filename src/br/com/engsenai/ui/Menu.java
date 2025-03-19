package br.com.engsenai.ui;

import java.util.Scanner;
import br.com.engsenai.dao.*;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("---------------------------");
		System.out.println("Você chegou em uma boa hora, \nagora podemos calcular cinco \ntipos de polígonos diferentes:\n");
		System.out.println("1- Quadrado (NOVO)");
		System.out.println("2- Retângulo (NOVO)");
		System.out.println("3- Trapézio (NOVO)");
		System.out.println("4. Circunferência (NOVO)");
		System.out.println("5- Triângulo (NOVO)");
		System.out.println("6- Sair");
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
		
		else if (opcao ==5) {
			TrianguloDao.criarTriangulo();
		}
		
		else{
			System.out.println("Essa função ainda não foi implementada");
		}
	}
	
	
	

}
