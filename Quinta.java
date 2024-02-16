import java.util.Scanner;

public class Quinta {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int num = ler.nextInt();
        
        if (num % 2 == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }

    }
}
