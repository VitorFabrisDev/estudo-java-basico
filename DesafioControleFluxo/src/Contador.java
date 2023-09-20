import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número da sequência: ");
        int iParametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número da sequência: ");
        int iParametroDois = terminal.nextInt();

        try {

            contar(iParametroUm, iParametroDois);

        }catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar(int iParametroUm, int iParametroDois) throws ParametrosInvalidosException{
        //Validar se iParametroUm é MAIOR que iParametroDois e lançar exceção.

        if(iParametroUm > iParametroDois) {
            throw new ParametrosInvalidosException();

        }else {
            int iContagem = iParametroDois - iParametroUm;

            for(int i = 0; i < iContagem; i++) {
                System.out.println("Imprimindo numero: " + (i+1));
            }


        }



    }

}