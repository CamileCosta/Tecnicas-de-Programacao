import java.util.Scanner;

public class Terceiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularAreaQuadrado(scanner);
                    break;
                case 2:
                    calcularAreaCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void calcularAreaQuadrado(Scanner scanner) {
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.println("A área do quadrado é: " + areaQuadrado);
    }

    private static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + areaCirculo);
    }
}