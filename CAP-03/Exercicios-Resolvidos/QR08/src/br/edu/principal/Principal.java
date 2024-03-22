package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu depósito: ");
		int deposito = sc.nextInt();
		
		System.out.print("Digite a taxa de juros(sem %): ");
		int taxa = sc.nextInt();
		
		int rendimento = deposito * taxa/100;
		int total = deposito + rendimento;
		
		System.out.println("Este foi seu total: "+ total);
		System.out.print("Este foi seu rendimento: "+ rendimento);

	}

}
