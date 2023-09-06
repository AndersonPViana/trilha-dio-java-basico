import java.util.Scanner;

public class Contator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch(Exception e) {
            System.out.println("O segundo numero tem que ser maior que o primeiro numero");
        }

        scanner.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int contator = 1; contator <= contagem; contator++){
            System.out.println("Imprimindo o numero " + contator);
        }
    }
}
