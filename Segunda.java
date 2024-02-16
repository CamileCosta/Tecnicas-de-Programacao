import java.util.Scanner;

public class Segunda{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número inteiro: ");
        int num1 = ler.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        int num2 = ler.nextInt();

        if (num1 == num2){
            System.out.println("Os números são iguais!");
        }else if(num1 > num2) {
            System.out.println("O primeiro número é maior! ");
        }else {
            System.out.println("O segundo número é maior!");
        }
      
    }

   
   
    
}
