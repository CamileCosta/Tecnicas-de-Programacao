import java.util.Scanner;

public class Nona {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Digite o" + (i +1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite outro nome para verificar na lista: ");
        String nomeVerificar = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < 5; i++){
            if (nomes[i].equalsIgnoreCase(nomeVerificar)){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            System.out.println("O nome está presente na lista.");
        } else {
            System.out.println("O nome não está na lista.");
        }

        scanner.close();
    }
}
