import java.util.Random;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  int numero = rand.nextInt(100) + 1;
  int palpite = 0;
  int tentativas = 0;

  System.out.println("BEM VINDO AO JOGO DE ADIVINHAÇÃO!");  
  System.out.println("\nAdivinhe um número entre 1 e 100.");

       while (palpite != numero) {
        System.out.print("\nDigite seu palpite: ");
        palpite = sc.nextInt();
        tentativas++;

      if (palpite < numero) {
      System.out.println("Seu palpite é muito baixo. Tente novamente.");
      } else if (palpite > numero) {
      System.out.println("Seu palpite é muito alto. Tente novamente."); 
       }

      while (palpite == numero) {
        System.out.println("\nParabéns! Você adivinhou o número em " + tentativas + " tentativas.");
        break;
      }
    }
  }
}
