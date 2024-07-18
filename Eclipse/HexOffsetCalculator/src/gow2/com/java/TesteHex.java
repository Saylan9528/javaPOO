package gow2.com.java;
import java.util.Scanner;
public class TesteHex {

	public static void main(String[] args) {
		String offset1, offset2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os offSets:");
		offset1 = sc.nextLine();
		offset2 = sc.nextLine();
		
		CalculoHex cal = new CalculoHex(offset1, offset2);
		
		cal.displayInfo();
	}

}
