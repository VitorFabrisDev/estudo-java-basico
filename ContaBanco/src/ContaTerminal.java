import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // TODO: Conhecer e importar a classe Scanner
        // Exibir mensagens para usuário
        // Obter pela classe Scanner os valores digitados no termial
        // Exibir a mensagem final

        Deposito deposito = new Deposito();
        Saque saque = new Saque();
        Scanner scanner = new Scanner(System.in);
        double dSaldo = 0;
        boolean bEncerrar = false;


        System.out.println("CAIXA ELETRONICO");
        while(!bEncerrar){

            System.out.println("Escolha a operação 1-Depósito || 2-Saque || 3- Encerrar");

            int iOperacao = scanner.nextInt();

            switch(iOperacao) {
                case 1:
                    System.out.println("Digite o valor depositado: ");

                    if(scanner.hasNextDouble()) {
                        double dValorDepositado = scanner.nextDouble();

                        dSaldo = deposito.depositar(dValorDepositado, dSaldo);
                        System.out.println("Seu novo saldo é: " + dSaldo);
                    } else {
                        System.out.println("Valor Inválido. Digite um valor decimal!");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor a Sacar: ");


                    if(scanner.hasNextDouble()){
                        double dvalorSacar = scanner.nextDouble();
                        dSaldo = saque.sacar(dvalorSacar,dSaldo);
                        System.out.println("Seu novo saldo é: "+ dSaldo);
                    }else{
                        System.out.println("Valor Inválido. Digite um valor decimal!");
                    }
                    break;
                case 3:
                    bEncerrar = true;
                    System.out.println("Processo finalizado, obrigado!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}