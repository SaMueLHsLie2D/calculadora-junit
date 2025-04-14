import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro número:");
        double numeroUm = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numeroDois = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Potenciar");

        int opcao = scanner.nextInt();
        double resultado = 0;

        switch(opcao) {
            case 1:
                resultado = calc.somar(numeroUm, numeroDois);
                break;
            case 2:
                resultado = calc.subtrair(numeroUm, numeroDois);
                break;
            case 3:
                resultado = calc.multiplicar(numeroUm, numeroDois);
                break;
            case 4:
                resultado = calc.dividir(numeroUm, numeroDois);
                break;
            case 5:
                resultado = calc.potenciar(numeroUm, numeroDois);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
