package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a temperatuda Celsius:");
		double c = scan.nextDouble();
		double f = c * 1.8 +32 ;
		
		System.out.println("Atemperatura " +c+ "C é igual a" +f+ " F");
		
		
		

	}

}
