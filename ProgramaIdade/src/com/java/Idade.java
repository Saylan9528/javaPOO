package com.java;

public class Idade {
	private int dias;
	private int anos;
	private int messes;
	private int total;
	
	
	Idade(){
		
	}
	public Idade(int anos, int messes, int dias){
		this.anos = anos;
		setMesses(messes);
		setDias(dias);
		calculo(anos, messes, dias);
	}
	private void setMesses(int messes) {
		if (messes < 12) {
			this.messes = messes;
		} else {
			System.out.println("Se messes for maior que 11 adicione 1 ano");
		}
	}
	private void setDias(int dias) {
		if (dias < 30) {
			this.dias = dias;
		} else {
			System.out.println("Se dias for maior que 30 adicione um mês");
		}
	}
	
	private void calculo(int anos, int messes, int dias) {
		int calculoAnos = this.anos * 365;
		int calculoMesses = this.messes * 30;
		this.total = calculoAnos + calculoMesses + this.dias;
	}
	
	public void displayInfo() {
		System.out.println("Anos: " + this.anos + " Messes: " + this.messes + " Dias: " + this.dias );
		System.out.println("Dias totais: " + this.total);
	}
}
