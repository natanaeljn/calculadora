package exerciciosaleatorios;

import java.util.Locale;
import java.util.Scanner;

import entities.calculo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("deseja fazer uma operaçao?");
		char resp = sc.next().charAt(0);
		while (resp != 'n') {
			System.out.println("digite dois numeros inteiros para o calculo ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			calculo calculo = new calculo(a, b);
			System.out.println(
					"qual operaçao deseja realizar? digite 1 =adiçao , 2 = subtraçao , 3 = multiplicaçao , 4 = divisao , 5 = raiz do elemento a e  6 = raiz elemento b");
			int operaçao = sc.nextInt();
			if (operaçao == 1) {
				calculo.soma();
				System.out.println("resultado da soma : " + calculo.soma());
			} else if (operaçao == 2) {
				calculo.subtraçao();
				System.out.println("resultado da subtraçao: " + calculo.subtraçao());
			} else if (operaçao == 3) {
				calculo.multiplicaçao();
				System.out.println("resultado da multiplicaçao : " + calculo.multiplicaçao());
			} else if (operaçao == 4) {
				calculo.divisao();
				System.out.println("resultado da divisao : " + calculo.divisao());
			} else if (operaçao == 5) {
				calculo.raizQuadradaA();
				System.out.println("resultado da raiz de A :" + calculo.raizQuadradaA());
			} else if (operaçao == 6) {
				calculo.raizQuadradaB();
				System.out.println("resultado da raiz de B:" + calculo.raizQuadradaB());
			}
			System.out.println("deseja fazer mais alguma operaçao? ");
			resp = sc.next().charAt(0);

		}
		System.out.println("obrigado por usar a calculadora da JnSystems");
		sc.close();

	}

}
