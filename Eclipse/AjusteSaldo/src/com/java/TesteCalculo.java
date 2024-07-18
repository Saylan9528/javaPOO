package com.java;
import java.util.Scanner;
public class TesteCalculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Saldo a acressentar:");
		double saldo = sc.nextDouble();
		
		Calculo cal = new Calculo(saldo);
		
		cal.displayInfo();

	}

}
