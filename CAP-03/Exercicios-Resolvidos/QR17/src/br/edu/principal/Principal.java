package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float deposito, cheque1, cheque2, cpmf1, cpmf2, saldo;
		
		System.out.print("Qual o valor do seu salário depositado? ");
		deposito = sc.nextFloat();
		
		System.out.print("Qual o valor do seu primeiro cheque? ");
		cheque1 = sc.nextFloat();
		System.out.print("Qual o valor do seu segundo cheque? ");
		cheque2 = sc.nextFloat();
		
		cpmf1 = cheque1 * 0.38F / 100;
		cpmf2 = cheque2 * 0.38F / 100;
		
		saldo = deposito - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.print("Este é o seu saldo de agora: R$" + saldo);
	}

}
