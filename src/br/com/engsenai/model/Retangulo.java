package br.com.engsenai.model;

public class Retangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;

	public void setLados(double base, double altura) {
		if (base <= 0 || altura <= 0) {
			System.out.println("Por favor inserir um tamanho maior que 0");
		} else {
			this.base = base;
			this.altura = altura;
			calcArea();
			calcPerimetro();
		}
	}

	private void calcArea() {
		this.area = base * altura;
	}

	private void calcPerimetro() {
		this.perimetro = (base * 2) + (altura * 2);
	}

	public void mostrarFicha() {
		if (area <= 0) {
			System.out.println("Erro ao montar ficha, valores inválidos");
		} else {
			System.out.println("=============================");
			System.out.println("Aqui as informações meu chapa");
			System.out.println("-----------------------------");
			System.out.println("Tipo: Retangulo");
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
			System.out.println("=============================\n");
		}
	}

}
