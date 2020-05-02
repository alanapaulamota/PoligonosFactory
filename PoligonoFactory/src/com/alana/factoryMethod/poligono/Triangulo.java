package com.alana.factoryMethod.poligono;

public class Triangulo implements Poligono {

	private int l1;
	private int l2;
	private int l3;

	public Triangulo(int l1, int l2, int l3) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public String getTipoFigura() {
		String retorno = "Valores invalidos para um triângulo";
		if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
			if (l1 == l2 && l2 == l3) {
				retorno = "O triângulo é Equilátero.";
			} else if (l1 == l2 || l1 == l3 || l2 == l3) {
				retorno = "O triângulo é Isósceles.";
			} else {
				retorno = "O triângulo é Escaleno.";
			}
		}
		return retorno;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}

}
