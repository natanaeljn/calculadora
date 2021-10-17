package entities;

public class calculo {
	private int a;
	private int b;

	public calculo(int a, int b) {

		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int soma() {
		return a + b;
	}

	public int subtraçao() {
		return a - b;
	}

	public int multiplicaçao() {
		return a * b;
	}

	public int divisao() {
		return a / b;
	}

	public double raizQuadradaA() {
		return Math.sqrt(a);
	}

	public double raizQuadradaB() {
		return Math.sqrt(b);
	}

}
