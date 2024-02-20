import java.util.Scanner;

public class Décima {
    public static void main(String[] args){
        String senhaSecreta = "Java123";

        Scanner scanner = new Scanner(System.in);

        String tentativaSenha;

        while (true) {
            System.out.print("Digite a senha: ");
            tentativaSenha = scanner.nextLine();

            if (tentativaSenha.equals(senhaSecreta)){
                System.out.println("Senha correta: Acesso concedido.");
                break;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        scanner.close();
    }
}
