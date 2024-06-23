package contador;
import java.util.Scanner;
public class ContadorJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroUm;
        int numeroDois;

        System.out.println("Bem-vindo ao contador Java! Preciso que me informe dois números, sendo que o primeiro deve menor que o segundo.");
        System.out.println("Por favor, informe o primeiro número: ");
        numeroUm = scan.nextInt();

        System.out.println("Agora informe o segundo número: ");
        numeroDois = scan.nextInt();
        
        try {
            contar (numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }
    }
        static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            
            if (numeroUm > numeroDois) {
                throw new ParametrosInvalidosException();
            } else {
                int contagem = numeroDois - numeroUm;
                System.out.println("Contando...");
                for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
                }   
            }

                        
        }
}
    


     
    

