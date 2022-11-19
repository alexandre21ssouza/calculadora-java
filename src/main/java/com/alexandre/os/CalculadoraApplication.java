package com.alexandre.os;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo a calculadora Java!");
		System.out.println();

		System.out.println("Digite a opção: 1-iniciar ou 0-sair. ");
		System.out.print("Digite a opção: ");
		int varLoop = sc.nextInt();
		

		if (varLoop > 1 || varLoop < 0) {
			System.out.println("Opção inválida! ");
		} else if (varLoop == 0) {
			System.out.println("Você saiu da calculadora Java! ");
			System.out.println("Deseja iniciar novamente! digite 1-sim ou 0-não : ");

			varLoop = sc.nextInt();
		}

		
		
		while (varLoop == 1) {
			sc.nextLine();
			System.out.println();

			System.out.println("Digite o tipo de operação: 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão ou 5-Sair. ");
			System.out.print("Tipo:  ");
			int operacao = sc.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Soma");
				System.out.print("Digite um número: ");
				int numeroSo1 = sc.nextInt();
				System.out.print("Digite um número: ");
				int numeroSo2 = sc.nextInt();
				int totalSoma = numeroSo1 + numeroSo2;

				System.out.print("Resultado da Soma: " + totalSoma);
				break;

			case 2:
				System.out.println("Subtração");
				System.out.print("Digite um número: ");
				int numeroSub1 = sc.nextInt();
				System.out.print("Digite um número: ");
				int numeroSub2 = sc.nextInt();
				int totalSubtracao = numeroSub1 - numeroSub2;

				System.out.print("Resultado da Subtração: " + totalSubtracao);
				break;

			case 3:
				System.out.println("Multiplicação");
				System.out.print("Digite um número: ");
				int numeroMult1 = sc.nextInt();
				System.out.print("Digite um número: ");
				int numeroMult2 = sc.nextInt();
				int totalMulti = numeroMult1 * numeroMult2;

				System.out.print("Resultado da Multiplicação: " + totalMulti);
				break;

			case 4:
				System.out.println("Divisão");
				System.out.print("Digite um número: ");
				int numeroDiv1 = sc.nextInt();
				System.out.print("Digite um número: ");
				int numeroDiv2 = sc.nextInt();
				int totalDiv = numeroDiv1 / numeroDiv2;

				System.out.print("Resultado da Divisão: " + totalDiv);
				break;

			case 5:
				varLoop = 0;
				System.out.println("Você saiu da calculadora Java!");
			}
			
			
		}


		sc.close();

	}
}
