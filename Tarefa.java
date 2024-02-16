import java.util.Scanner;

public class Tarefa{

   
    
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = ler.nextInt();
    
    if(num > 0){
        System.out.println("Número positivo!");
    }else{
        System.out.println("Número negativo!");
    }


    }
}
