package com.java;
import java.util.Scanner;
public class TesteMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3, num4, num5, num6;
		System.out.println("Digite os numeros que deseja tirar a media aritimetica:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		num5 = sc.nextDouble();
		num6 = sc.nextDouble();
		
		Media media = new Media(num1, num2, num3, num4, num5, num6);
		media.displayInfo();
		

	}

}
