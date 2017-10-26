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

        Poupanca p = new Poupanca();
        Corrente c = new Corrente();
        /* 
        c.deposita(10);
        c.deposita(5);
        c.deposita(2);
        c.deposita(3);
        c.saca(8);
        c.saca(2);
        c.saca(1);
        System.out.println(c.getExtrato());
         */
        System.out.println("Escolha sua conta: ");
        System.out.println("1- Conta Poupança");
        System.out.println("2- Conta Corrente ");
        System.out.println("0- Sair ");

        int opcao = sc.nextInt();
        int option;
        
        do {
            switch (opcao) {
                case 1: {
                    do {
                        System.out.println("Bem vindo a sua poupança! O que deseja fazer?");
                        System.out.println("1- Depositar");
                        System.out.println("2- Sacar");
                        System.out.println("3- Tirar Extrato");
                        System.out.println("4- Consultar saldo");
                        System.out.println("5- Transferir para conta corrente");
                        System.out.println("0- Voltar");

                        option = sc.nextInt();

                        switch (option) {
                            case 1: {
                                System.out.println("Digite o valor a ser depositado: ");
                                double dep = sc.nextDouble();
                                p.deposita(dep);
                                break;
                            }
                            case 2: {
                                System.out.println("Digite o valor a ser sacado: ");
                                double sac = sc.nextDouble();
                                p.saca(sac);
                                break;
                            }
                            case 3: {
                                System.out.println(p.getExtrato());
                                System.out.println("Saldo: R$ " + p.getSaldo());
                                break;
                            }
                            case 4: {
                                System.out.println("Saldo: R$ " + p.getSaldo());
                                break;
                            }
                            case 5: {
					
				System.out.println("Digite o valor a ser transferido");
				double transf = sc.nextDouble();
				p.transferir(c, transf);			
				
				}
                            default:
                                if(option != 0)
                                    System.out.println("Opção incorreta, tente novamente.");
                        }
                    } while (option != 0);
                    break;
                }

                case 2: {
                    do {
                        System.out.println("Bem vindo a sua conta corrente! O que deseja fazer?");
                        System.out.println("1- Depositar");
                        System.out.println("2- Sacar");
                        System.out.println("3- Tirar Extrato");
                        System.out.println("4- Consultar saldo");
                        System.out.println("5- Transferir para Poupança");
                        System.out.println("0- Voltar");

                        option = sc.nextInt();

                        switch (option) {
                            case 1: {
                                System.out.println("");
                                System.out.println("Digite o valor a ser depositado: ");
                                double dep = sc.nextDouble();
                                c.deposita(dep);
                                break;
                            }
                            case 2: {
                                System.out.println("");
                                System.out.println("Digite o valor a ser sacado: ");
                                double sac = sc.nextDouble();
                                c.saca(sac);
                                break;
                            }
                            case 3: {
                                System.out.println("");
                                System.out.println(c.getExtrato());
                                System.out.println("Saldo: R$ " + c.getSaldo());
                                break;
                            }
                            case 4: {
                                System.out.println("");
                                System.out.println("Saldo: R$ " + c.getSaldo());
                                break;
                            }
                            case 5: {
					
				System.out.println("Digite o valor a ser transferido");
				double transf = sc.nextDouble();
				c.transferir(p, transf);			
				
				}
                            default:
                                if(option != 0)
                                    System.out.println("Opção incorreta, tente novamente.");
                        }
                    } while (option != 0);
                }
            }    
                
            if(opcao != 0){
                System.out.println("Opção incorreta, tente novamente.");
                System.out.println("Escolha sua conta: ");
                System.out.println("1- Conta Poupança");
                System.out.println("2- Conta Corrente ");
                System.out.println("0- Sair ");

                opcao = sc.nextInt();
            }
            
        } while (opcao != 0);
        System.out.println("Fim");
    }

}
