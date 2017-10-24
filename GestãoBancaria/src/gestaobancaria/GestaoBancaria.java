/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaobancaria;

import java.util.Scanner;

/**
 *
 * @author 71500073
 */
public class GestaoBancaria {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Escolha sua conta: ");
         System.out.println("1- Conta Poupança");
         System.out.println("2- Conta Corrente ");
         
         int opcao = sc.nextInt();
         
         switch (opcao) {
             case 1: {
                 System.out.println("Bem vindo a sua poupança! O que deseja fazer?");
                 System.out.println("1- Depositar");
                 System.out.println("2- Sacar");
                 System.out.println("3- Tirar Extrato");
                 System.out.println("4- Consultar saldo");
                 
                 int option = sc.nextInt();
                 
                 switch (option){
                     case 1: {
                         //chamar metodo de deposito
                         break;
                     }
                     case 2: {
                         //chamar metodo de saque
                         break;
                     }
                     case 3: {
                         //chamar metodo de extrato
                         break;
                     }
                     case 4: {
                         //chamar metodo de saldo
                         break;
                     }
                     
                 }
                 
                 break;
             }
             case 2: {
                 System.out.println("Bem vindo a sua conta corrente! O que deseja fazer?");
                 System.out.println("1- Depositar");
                 System.out.println("2- Sacar");
                 System.out.println("3- Tirar Extrato");
                 System.out.println("4- Consultar saldo");
                 
                 int option = sc.nextInt();
                 
                 switch (option){
                     case 1: {
                         //chamar metodo de deposito
                         break;
                     }
                     case 2: {
                         //chamar metodo de saque
                         break;
                     }
                     case 3: {
                         //chamar metodo de extrato
                         break;
                     }
                     case 4: {
                         //chamar metodo de saldo
                         break;
                     }
                 }
                 break;
             }
         }
    }
    
}
