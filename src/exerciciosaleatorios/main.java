package exerciciosaleatorios;

import java.util.Locale;
import java.util.Scanner;

import entities.calculo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("deseja fazer uma operašao?");
		char resp = sc.next().charAt(0);
		while (resp != 'n') {
			System.out.println("digite dois numeros inteiros para o calculo ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			calculo calculo = new calculo(a, b);
			System.out.println(
					"qual operašao deseja realizar? digite 1 =adišao , 2 = subtrašao , 3 = multiplicašao , 4 = divisao , 5 = raiz do elemento a e  6 = raiz elemento b");
			int operašao = sc.nextInt();
			if (operašao == 1) {
				calculo.soma();
				System.out.println("resultado da soma : " + calculo.soma());
			} else if (operašao == 2) {
				calculo.subtrašao();
				System.out.println("resultado da subtrašao: " + calculo.subtrašao());
			} else if (operašao == 3) {
				calculo.multiplicašao();
				System.out.println("resultado da multiplicašao : " + calculo.multiplicašao());
			} else if (operašao == 4) {
				calculo.divisao();
				System.out.println("resultado da divisao : " + calculo.divisao());
			} else if (operašao == 5) {
				calculo.raizQuadradaA();
				System.out.println("resultado da raiz de A :" + calculo.raizQuadradaA());
			} else if (operašao == 6) {
				calculo.raizQuadradaB();
				System.out.println("resultado da raiz de B:" + calculo.raizQuadradaB());
			}
			System.out.println("deseja fazer mais alguma operašao? ");
			resp = sc.next().charAt(0);

		}
		System.out.println("obrigado por usar a calculadora da JnSystems");
		sc.close();

	}

}
