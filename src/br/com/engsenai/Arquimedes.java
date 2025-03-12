//MAIN
package br.com.engsenai;
import br.com.engsenai.model.*;


public class Arquimedes {
	public static void main(String args[]) {
		System.out.println("Hello Worldo!");
		
		//Quadrado
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(4.0);
		quadrado1.mostrarFicha();
		
		//Retangulo
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setLados(3.0, 4.0);
		retangulo1.mostrarFicha();
		
		//Triangulo
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setLados(5.0, 6.0);
		triangulo1.mostrarFicha();
		
		//Trapezio
		Trapezio trapezio1 = new Trapezio();
		trapezio1.setLados(3.0, 4.5, 3.0);
		trapezio1.mostrarFicha();
		
		//Circulo
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(5.0);
		circulo1.mostrarFicha();
	}
	
	

}
