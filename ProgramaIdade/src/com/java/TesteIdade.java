package com.java;
import java.util.Scanner;
public class TesteIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos anos vc tem: ");
		int anos = sc.nextInt();
		System.out.println("Digite quantos messes vc tem: ");
		int messes = sc.nextInt();
		System.out.println("Digite quantos dias vc tem:");
		int dias = sc.nextInt();
		
		
		Idade idade = new Idade(anos, messes, dias);
		
		idade.displayInfo();
		sc.close();
	}
}
