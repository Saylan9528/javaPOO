package com.java;

public class Calculo {
	private double saldo;
	private double result;
	
	
	Calculo(){
		
	}
	Calculo(double saldo){
		this.saldo = saldo;
		calcular(saldo);
	}
	
	private void calcular(double saldo) {
		this.result = this.saldo * 1.01;
	}
	
	public void displayInfo() {
		System.out.println("O valor com acressimo de 1% é : " + this.result);
	}
}
