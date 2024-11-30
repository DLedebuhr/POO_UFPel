/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_aula_pratica_1_exercicio_1;

/**
 *
 * @author Dienifer Ledebuhr
 */
public class Conta {
    
    int numero;
    String dono;
    double saldo;
    double limite;

    Conta (String dono, double saldo) {
        
        this.dono = dono;
        this.saldo = saldo;
        
    }
    
    Conta (String dono, double saldo, double limite) {
        
        this(dono, saldo);
        this.limite = limite;
        
    }
    
    void depositar (double valor) {
        
        this.saldo = this.saldo + valor;
        
    }
    
    boolean sacar (double valor) {
        
        if (saldo + limite > valor) {
            
            this.saldo = this.saldo - valor;
            return true;
        
        }
        
        return false;
        
    }
    
    void imprimir () {
        
        System.out.println("-- Conta: ");
        
        System.out.println("Numero: " + numero);
        System.out.println("Done: " + this.dono);
        System.out.println("Saldo: " + this.saldo + " | Limite: " + this.limite + "\n");

    }
}
