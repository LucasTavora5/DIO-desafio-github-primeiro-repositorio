package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do arquivo");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / velocidadeInternet ;
		System.out.println("Tempo de download é: " + tempo);
	}

}
