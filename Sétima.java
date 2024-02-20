import java.util.Scanner;

public class Sétima {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

    System.out.@println("Digite a idade de uma pessoa:");
    int idade = scanner.nextInt();
    
    if (idade > 90) {
        System.out.println("Ja tá com o pé na cova, tá fazendo hora exata.");
    }
    else if (idade < 18) {
        System.out.println("A pessoa é menor de idade.");
    } else if (idade >= 18 && idade < 60){
        System.out.println("A pessoa é adulta.");
    } else{
        System.out.println("A pessoa é idosa.");
    }
} 
}

