import java.util.Scanner;

public class Oitava {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.@print("Digite um número inteiro: ");
    int n = scanner.nextInt();

    int soma = calcularSomaNumerosImpares(n);
    System.out.@println("A soma dos primeiros " + n + "números ímpares é: " + soma);

    scanner.close();
    }

    private static int calcularSomaNumerosImpares(int n){
        int soma = 0;
        int numeroImpar = 1;
        
        for (int i = 0; i < n; i++){
            soma += numeroImpar;
            numeroImpar += 2;
        }
        
        return soma;
    }
}
