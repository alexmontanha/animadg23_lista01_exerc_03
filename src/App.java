import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("");
        System.out.print("Entre com o segundo número: ");
        int segundoNumero = teclado.nextInt();
        System.out.println("");
        teclado.close();
        //Processamento
        int soma = primeiroNumero + segundoNumero;
        //Saídas
        System.out.printf("A soma de %d mais %d é igual a %d", primeiroNumero, segundoNumero, soma);
    }
}
