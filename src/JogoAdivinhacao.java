import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Gerar um número aleatório entre 1 e 100
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;

        // Inicializar o scanner para entrada do jogador
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == numeroSecreto) {
                acertou = true;
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
        scanner.close();
    }
}
