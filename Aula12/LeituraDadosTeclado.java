package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Digite seu primeiro nome, idade,altura, quatidade de filhos e se tem algum pet:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		float altura = scan.nextFloat();
		byte qtdFilhos= scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Qauntidade de filhos: " + qtdFilhos);
		System.out.println("Tem pet?: " + temPet);
	}

}
