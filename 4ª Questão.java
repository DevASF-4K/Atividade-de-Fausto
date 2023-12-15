import java.util.Scanner;
class Main {
 public static void main(String[] args) {
 int[][] matriz = {
 {0, 2, 11, 6, 15, 11, 1},
 {2, 0, 7, 12, 4, 2, 15},
 {11, 7, 0, 11, 8, 3, 13},
 {6, 12, 11, 0, 10, 2, 1},
 {15, 4, 8, 10, 0, 5, 13},
 {11, 2, 3, 2, 5, 0, 14},
 {1, 15, 13, 1, 13, 14, 0}
 };
     Scanner scanner = new Scanner(System.in);
     int cidadeAtual = 0;
     int cidadeAnterior = 0;
     int tempoTotal = 0;
     int[] cidadesVisitadas = new int[matriz.length];
     
   while (true) {
     System.out.print("Informe a cidade a ser visitada de 1 a 7 (0 para terminar): ");
     int cidade = scanner.nextInt();
   if (cidade == 0) {
   break;
   }
 
     if (cidade < 1 || cidade > matriz.length) {
     System.out.println("Cidade inválida. Tente novamente.");
     continue;
     }
     cidadesVisitadas[cidadesVisitadas.length - 1] = cidade;
     if (cidade != cidadeAnterior) {
     tempoTotal += matriz[cidadeAtual][cidade - 1];
     }
     cidadeAtual = cidade;
   }
     if (cidadeAtual > 0) {
     System.out.println("O tempo total do percurso é de " + tempoTotal + " horas.");
     } else {
      System.out.println("Nenhuma cidade visitada.");
   }
 scanner.close();
 }
}
