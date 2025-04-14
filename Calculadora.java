public class Calculadora {

    public double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double dividir(double numeroUm, double numeroDois) {
        if (numeroDois != 0) {
            return numeroUm / numeroDois;
        } else {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
    }

    public double potenciar(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }
}

