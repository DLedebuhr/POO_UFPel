/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_aula_pratica_1_exercicio_1;

import java.util.Scanner;

/**
 * Classe principal da aula pratica 01
 * @author Dienifer Ledebuhr
 */
public class POO_Aula_Pratica_1_Exercicio_1 { // classe principal

    /**
     * Este é o metodo principal da aplicação
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner ( System.in );
        
        // Conta Dyy = new Conta(); // Com construtor implicito
        // Conta Myy = new Conta();
        
        Conta Dyy;
        
        Conta Myy = new Conta("Marciane Ledebuhr", 1000);
        
        String nome = sc.nextLine();
        double valor = sc.nextDouble();
        
        Dyy = new Conta (nome, valor, 1000);
                
        // Dyy.dono = "Dienifer Ledebuhr";
        // Dyy.dono = sc.nextLine();
        
        // Dyy.saldo = 500;
        // Dyy.saldo = sc.nextDouble();
        
        // Myy.dono = "Marciane Ledebuhr";
        // Myy.saldo = 1000;
        
        // System.out.println("Done: " + Dyy.dono);
        // System.out.println("Saldo: " + Dyy.saldo + "\n");
        
        // System.out.println("Done: " + Myy.dono);
        // System.out.println("Saldo: " + Myy.saldo + "\n");
    
        Dyy.imprimir();
        
        Dyy.depositar (200);
        
        Dyy.imprimir();
        
        Dyy.sacar (350);
        
        Dyy.imprimir();
        Myy.imprimir();
    
    
    }
    
}
