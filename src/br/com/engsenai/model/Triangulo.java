package br.com.engsenai.model;

public class Triangulo {
	double base;
	double altura;
	double area;

	public void setLados(double base, double altura) {
		if (base <= 0 || altura <= 0) {
			System.out.println("Por favor inserir um tamanho maior que 0");
		} else {
			this.base = base;
			this.altura = altura;
			calcArea();
		}
	}

	private void calcArea() {
		this.area = (base * altura) / 2;
	}

	public void mostrarFicha() {
		if (area <= 0) {
			System.out.println("Erro ao montar ficha, valores inválidos");
		} else {
			System.out.println("=============================");
			System.out.println("Aqui as informações meu chapa");
			System.out.println("-----------------------------");
			System.out.println("Tipo: Triângulo");
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("Area: " + area);
			System.out.println("=============================\n");
		}
	}

}
