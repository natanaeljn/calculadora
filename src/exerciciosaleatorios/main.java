package exerciciosaleatorios;

import java.util.Locale;
import java.util.Scanner;

import entities.calculo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("deseja fazer uma opera�ao?");
		char resp = sc.next().charAt(0);
		while (resp != 'n') {
			System.out.println("digite dois numeros inteiros para o calculo ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			calculo calculo = new calculo(a, b);
			System.out.println(
					"qual opera�ao deseja realizar? digite 1 =adi�ao , 2 = subtra�ao , 3 = multiplica�ao , 4 = divisao , 5 = raiz do elemento a e  6 = raiz elemento b");
			int opera�ao = sc.nextInt();
			if (opera�ao == 1) {
				calculo.soma();
				System.out.println("resultado da soma : " + calculo.soma());
			} else if (opera�ao == 2) {
				calculo.subtra�ao();
				System.out.println("resultado da subtra�ao: " + calculo.subtra�ao());
			} else if (opera�ao == 3) {
				calculo.multiplica�ao();
				System.out.println("resultado da multiplica�ao : " + calculo.multiplica�ao());
			} else if (opera�ao == 4) {
				calculo.divisao();
				System.out.println("resultado da divisao : " + calculo.divisao());
			} else if (opera�ao == 5) {
				calculo.raizQuadradaA();
				System.out.println("resultado da raiz de A :" + calculo.raizQuadradaA());
			} else if (opera�ao == 6) {
				calculo.raizQuadradaB();
				System.out.println("resultado da raiz de B:" + calculo.raizQuadradaB());
			}
			System.out.println("deseja fazer mais alguma opera�ao? ");
			resp = sc.next().charAt(0);

		}
		System.out.println("obrigado por usar a calculadora da JnSystems");
		sc.close();

	}

}
