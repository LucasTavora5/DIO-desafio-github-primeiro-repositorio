package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		int resultado = num1 + num2;
		System.out.println("Asoma dos úmeros é: " + resultado);
		

	}

}
