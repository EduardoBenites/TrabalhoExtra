/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaobancaria;

/**
 *
 * @author 71600426
 */
public class Poupanca extends Conta{
    
    public void Redimento(double valor) {
        super.setSaldo((super.getSaldo() * valor) / 100);
    }
}
