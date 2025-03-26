package br.com.engsenai.model;

public class Trapezio {
	private double baseMenor;
	private double baseMaior;
	private double altura;
	private double area;

	public void setLados(double baseMenor, double baseMaior, double altura) {
		if (baseMenor <= 0 || baseMaior <= 0 || altura <= 0) {
			System.out.println("Por favor inserir um tamanho maior que 0");
		} else {
			this.baseMenor = baseMenor;
			this.baseMaior = baseMaior;
			this.altura = altura;
			calcArea();
		}
	}

	private void calcArea() {
		this.area = ((baseMenor + baseMaior) * altura) / 2;
	}

	public void mostrarFicha() {
		if (area <= 0) {
			System.out.println("Erro ao montar ficha, valores inválidos");
		} else {
			System.out.println("=============================");
			System.out.println("Aqui as informações meu chapa");
			System.out.println("-----------------------------");
			System.out.println("Tipo: Trapézio");
			System.out.println("Base Menor: " + baseMenor);
			System.out.println("Base Maior: " + baseMaior);
			System.out.println("Altura: " + altura);
			System.out.println("Area: " + area);
			System.out.println("=============================\n");
		}
	}

}
