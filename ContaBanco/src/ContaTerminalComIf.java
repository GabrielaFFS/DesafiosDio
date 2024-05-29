import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalComIf {

    public static void main(String[] args) {

        double saldo= 2500;
        String nomeCliente= "Gabriela Freire";
        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();


        System.out.println("Por favor, digite o número da agência:");
         String agencia = scanner.next();

         if (numero==1021 && agencia.equals ("067-8")) {
            System.out.println( "Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta "  +numero +" e seu saldo " + saldo + " já está disponível para saque.");
        
         } else {
            System.out.println("Por favor, digite o seu nome:");
         String nome = scanner.next();
         System.out.println( "Olá " + nome+ " obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta "  +numero +" e seu saldo " + saldo + " já está disponível para saque.");
        
            
         }

            
        scanner.close();

    }

}

