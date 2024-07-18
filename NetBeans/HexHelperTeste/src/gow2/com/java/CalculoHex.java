package gow2.com.java;

public class CalculoHex {
	private int offSetX;
	private int offSetY;
	private int numLinhas;
	
	CalculoHex(){
		
	}
	
	CalculoHex(String hexOffSetX, String hexOffSetY){
		this.offSetX = Integer.parseInt(hexOffSetX, 16);
		this.offSetY = Integer.parseInt(hexOffSetY, 16);
		calculoOffSet();
	}
	
	private void calculoOffSet() {
		int diferenca = offSetY - offSetX;
		int bytesPorLinha = 16;
		this.numLinhas = diferenca / bytesPorLinha + 1;
	}
	
	public void displayInfo() {
		System.out.println("Offset X (decimal): " + this.offSetX);
		System.out.println("Offset Y (decimal): " + this.offSetY);
		System.out.println("Numero de linhas entre os offsets: " + this.numLinhas);
	}
}
