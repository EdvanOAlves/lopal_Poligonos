//QUADRADO
package br.com.engsenai.model;

public class Quadrado {
	double lado;
	double area;
	double perimetro;

	public void setLado(double lado) {
		if (lado <= 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.lado = lado;
			calcArea();
			calcPerimetro();
		}
	}

	private void calcArea() {
		this.area = lado * lado;
	}

	private void calcPerimetro() {
		this.perimetro = lado * 4;
	}

	public void mostrarFicha() {
		if (area <= 0) {
			System.out.println("Erro ao montar ficha, valores inválidos");
		} else {
			System.out.println("==============================");
			System.out.println("Aqui as informações meu chapa");
			System.out.println("------------------------------");
			System.out.println("Tipo: Quadrado");
			System.out.println("Lado: " + lado);
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
			System.out.println("=============================\n");
		}
	}

}