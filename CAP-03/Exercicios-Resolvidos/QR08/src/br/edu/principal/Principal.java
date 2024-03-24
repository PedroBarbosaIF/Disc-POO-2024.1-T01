package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu depósito: ");
		float deposito = sc.nextFloat();
		
		System.out.print("Digite a taxa de juros(sem %): ");
		float taxa = sc.nextFloat();
		
		float rendimento = deposito * taxa/100;
		float total = deposito + rendimento;
		
		System.out.println("Este foi seu total: "+ total);
		System.out.print("Este foi seu rendimento: "+ rendimento);

	}

}
