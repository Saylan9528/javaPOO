package br.com.banco;

/**
 *
 * @author phmm
 */
public class Conta {
    
    public int agencia;
    public int numero;
    public double saldo;
   
    
    public Conta(){
        
    }
    
    public Conta(int agencia, int conta, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void retirar(double valor){
        this.saldo -= valor;
    }
    
    public double verificarSaldo(){
        return this.saldo;
    }
    
    
}
