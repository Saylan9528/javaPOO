package gow2.com.java;

import java.util.Scanner;

public class TesteHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HexToLittleEndian hexConverter = new HexToLittleEndian();

        int escolha;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calcular offset");
            System.out.println("2 - Converter para Little Endian");
            System.out.println("3 - Sair");
            System.out.print("Digite sua escolha: ");
            escolha = sc.nextInt();
            sc.nextLine(); // Limpar o buffer após a leitura do inteiro

            switch (escolha) {
                case 1:
                    String offset1, offset2;
                    System.out.println("Digite os offsets:");
                    offset1 = sc.nextLine();
                    offset2 = sc.nextLine();

                    // Criar objeto de cálculo de offset
                    CalculoHex cal = new CalculoHex(offset1, offset2);
                    cal.displayInfo();
                    break;
                case 2:
                    String valorHex;
                    System.out.println("Digite o valor hexadecimal:");
                    valorHex = sc.nextLine();

                    // Converter para Little Endian
                    HexToLittleEndian end = new HexToLittleEndian(valorHex);
                    System.out.println("Resultado da conversão para Little Endian: " + end.getResult());
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

        } while (escolha != 3);

        sc.close();
    }
}
