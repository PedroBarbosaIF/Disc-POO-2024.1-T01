package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		System.out.print("Digite seu ano de nascimento ");
		int anoNascimento = sc.nextInt();
		
		int idadeAtual = anoAtual - anoNascimento;
		int idade2050 = 2050 - anoNascimento;
		
		System.out.println("Esta é sua idade atual ou será sua idade neste ano: "+ idadeAtual);
		System.out.println("Esta é sua idade em 2050: "+ idade2050);
	}

}
