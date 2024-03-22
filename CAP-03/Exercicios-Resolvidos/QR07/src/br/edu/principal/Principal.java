package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dgite seu salário base: ");
		int salario = sc.nextInt();
		
		int imposto = salario *10/100;
		int salarioReceber = salario + 50 - imposto;
		
		System.out.print("Este é o salário que você receberá(gratificação de R$50): "+ salarioReceber);
		
		
		
	}

}
