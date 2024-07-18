
package br.com.banco;

import java.util.Scanner;

/**
 *
 * @author phmm
 */
public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cc = new Conta();
        System.out.println("Digite a Agencia:");
        cc.agencia = sc.nextInt();
        System.out.println("Digite a Conta");
        cc.numero = sc.nextInt();
        cc.saldo = 100.0;
        System.out.println("Agencia: " + cc.agencia + "Numero: " + cc.numero);
        System.out.println("Saldo disponivel: " + cc.saldo);
        
        
        System.out.printf("Digite uma opção: %n (1) Depositar %n (2) Sacar %n (3) Verificar Saldo %n (4) sair %n");
        int opc =  sc.nextInt();
        
        if (opc == 1){
            System.out.println("valor a depositar:");
            double valor = sc.nextDouble();
            cc.depositar(valor);
        } else if (opc == 2){
            System.out.println("valor a Sacar:");
            double valor = sc.nextDouble();
            cc.retirar(valor);
        } else if(opc == 3){
            System.out.println("Saldo: "+ cc.verificarSaldo());
        } else {
           System.out.println("Opção invalida");
        }
        
        
    
}
}
