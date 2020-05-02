package com.alana.factoryMethod.poligono;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String TFigura;
		
		
		try (java.util.Scanner ler = new Scanner(System.in)) {
			System.out.println("1.Triângulo");
			System.out.println("2.Quadrado");
			System.out.println("3.Pentágono");
			System.out.println("Digite o nome do seu polígono:");

			TFigura = ler.next();

			Poligono poligono = PoligonoFactory.creatPoligono(TFigura);
			System.out.println(poligono.getTipoFigura());
		}
	}
}