package com.java;

public class Media {
	private double num1, num2, num3, num4, num5, num6;
	private double media1, media2, result;
	
	Media(){
		
	}
	Media(double num1, double num2, double num3, double num4, double num5, double num6){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		calcularMedia(num1, num2,num3, num4, num5,num6);
	}
	
	private void calcularMedia(double num1,double num2,double num3,double num4,double num5,double num6) {
		this.media1 = (this.num1 + this.num2 + this.num3) /3;
		this.media2 = (this.num4 + this.num5 + this.num6) /3;
		this.result = (this.media1 + this.media2) /2;
	}
	
	public void displayInfo() {
		System.out.println("As media dos numeros: " + this.num1 + ", " + this.num2 +", " + this.num3 + " é: " + this.media1);
		System.out.println("As media dos numeros: " + this.num4 + ", " + this.num5 +", " + this.num6 + " é: " + this.media2);
		System.out.println("E a media das medias: " + this.media1 + ", " + this.media2 + " é " + this.result);
	}
}
