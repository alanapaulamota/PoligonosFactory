package com.alana.factoryMethod.poligono;

public class PoligonoFactory {
	public static Poligono creatPoligono(String tipoFigura) {
		if (tipoFigura.equals("Triangulo")) {
			return new Triangulo(10, 10, 12);
		}
		if (tipoFigura.equals("Quadrado")) {
			return new Quadrado();
		}
		if (tipoFigura.equals("Pentagono")) {
			return new Pentagono();
		}
		throw new IllegalArgumentException("Figura inexistente");
	}
}