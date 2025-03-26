package br.com.engsenai.model;

public class Circulo {
	private double raio;
	private double area;

	public void setRaio(double raio) {
		if (raio <= 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.raio = raio;
			calcArea();
		}
	}

	private void calcArea() {
		this.area = (Math.PI * (raio * raio));
	}

	public void mostrarFicha() {
		if (area <= 0) {
			System.out.println("Erro ao montar ficha, valores inválidos");
		} else {
			System.out.println("==============================");
			System.out.println("Aqui as informações meu chapa");
			System.out.println("------------------------------");
			System.out.println("Tipo: Circulo");
			System.out.println("Raio: " + raio);
			System.out.println("Area: " + (String.format("%.2f", area)) + "...");
			System.out.println("=============================\n");
		}
	}

}
