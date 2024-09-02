import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero1 = 0;
        int numero2 = 0;

        boolean contagemValida = false;
        while (!contagemValida) {
            try{
                System.out.println("Digite o primeiro número:");
                numero1 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                 numero2 = scanner.nextInt();

                if (numero1 >= numero2) {
                    throw new ParametrosInvalidosException();
                }
                contagemValida = true;

            }catch(ParametrosInvalidosException e){
                System.out.println("O primeiro número deve ser menor que o segundo número");
                scanner.nextLine(); // Limpa o buffer do scanner
            }catch(InputMismatchException e){
                System.out.println("Por favor insirir números e não caracteres");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            }
        }
        Contagem(numero1, numero2);
    }
    static void Contagem(int numero1, int numero2) throws ParametrosInvalidosException{
        int interacoes = numero2 - numero1;
        int numeroInicial = 1;
        for(int i = interacoes; numeroInicial <= i; numeroInicial++){
            System.out.println("Contagem do primiro número ao segundo número: " + numeroInicial);
          }
    }
}
