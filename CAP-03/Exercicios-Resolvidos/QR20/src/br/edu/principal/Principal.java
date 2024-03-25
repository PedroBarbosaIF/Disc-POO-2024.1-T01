package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a altura da parede? ");
		float altura = sc.nextFloat();
		
		System.out.print("Qual o valor do ângulo formado? ");
		int angulo = sc.nextInt();
		
		double radiano = angulo * Math.PI / 180;
		double escada = altura / Math.sin(radiano);
		
		System.out.print("Esta é a altura da escada: "+ escada);
	}

}
