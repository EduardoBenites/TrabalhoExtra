
package gestaobancaria;

public class GestaoBancaria {
    public static void main(String[] args) {
        Conta c = new Conta();
        
        c.deposita(10);
        c.deposita(5);
        c.deposita(2);
        c.deposita(3);
        c.saca(8);
        c.saca(2);
        c.saca(1);
        System.out.println(c.getExtrato());
       
    }
}