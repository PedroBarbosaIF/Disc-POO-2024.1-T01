package br.edu.principal;
import java.util.Scanner;
public class Principal {
//QUESTÃO RESOLVIDA 03 - CAP. 3
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		double nota1 = sc.nextInt();
		System.out.println("Digite o peso da primeira nota: ");
		double peso1 = sc.nextInt();
		//declarando e lendo primeira nota e peso
		
		System.out.println("Digite a sua segunda nota: ");
		double nota2 = sc.nextInt();
		System.out.println("Digite o peso da segunda nota: ");
		double peso2 = sc.nextInt();
		//declarando e lendo segunda nota e peso
		
		System.out.println("Digite a sua terceira nota: ");
		double nota3 = sc.nextInt();
		System.out.println("Digite o peso da terceira nota: ");
		double peso3 = sc.nextInt();
		//declarando e lendo terceira nota e peso
		
		double mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
		System.out.print("Esta é a média ponderada das suas notas: "+ mediaPonderada);
		
	}

}
