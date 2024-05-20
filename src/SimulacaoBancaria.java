import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        double saldo = 0;
    
        while (true) { 
            System.out.println("\n====Menu=====\n\n1 - Depositar\n2 - Sacar\n3 - Consultar Saldo\n0 - Sair");
            System.out.print("\nDigite Sua Opção: "); 
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("\nQuanto Deseja Depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.print("\nSaldo atual " + saldo + "R$");
                    continue;
                }
                case 2 -> {
                    System.out.print("\nQuanto Deseja Sacar: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo){
                        saldo -= saque;
                        System.out.print("\nSaldo Atual:" + saldo + "R$");
                    }else {
                        System.out.print("\nSaldo insuficiente.");
                    }   continue;
                }
                case 3 -> {
                    System.out.print("\nSaldo atual: " + saldo);
                    continue;
                }

                case 0 -> {
                    System.out.println("\nPrograma encerrado");
                break;
                }
                
                default -> {
                    System.out.println("\nOpção inválida. Tente novamente.");
                continue;
                }
           }break;
        }
    }   
  }

