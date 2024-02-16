import java.util.Scanner;

public class Quarto {

    public static void main(String[] args){
        System.out.println("Insira um número: ");
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + "x" + i + "=" + resultado);
        }
    }
    
    
}
