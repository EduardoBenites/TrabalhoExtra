
package gestaobancaria;


public class Conta {
    
    private double saldo;
    private String extrato;
    
    public void deposita(double valor) {
        this.saldo += valor;
        setSaldo(valor);
        salvaExtrato(valor);
    }

    public void saca(double valor) {
        this.saldo -= valor;
        setSaldo(-valor);
        salvaExtrato(-valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    
    public void salvaExtrato(double valor){
        if(this.extrato == null)
            this.extrato = "Extrato bancário:\n• R$ " + valor;
        this.extrato = this.extrato + "\n• R$ " + valor;
    }

    public String getExtrato() {
        return extrato;
    }

    

    
}
