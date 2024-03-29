package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota");
		float nota2 = scanner.nextFloat();
		
		System.out.println("Digite a terceira nota");
		float nota3 = scanner.nextFloat();
		
		System.out.println("A média é");
		float mediaTotal = (nota1 + nota2 + nota3)/3;
	    
		System.out.println(mediaTotal);
		
		
		
		

	}

}
