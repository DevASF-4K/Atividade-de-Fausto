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

   System.out.print("Informe a cidade de origem (de 1 a 7): ");
 int origem = scanner.nextInt();
 
   System.out.print("Informe a cidade de destino obrigatório (de 1 a 7): ");
 int destino = scanner.nextInt();
 
   System.out.print("Informe a primeira cidade alternativa de descanso (de 1 a 7): ");
 int descanso1 = scanner.nextInt();
 
   System.out.print("Informe a segunda cidade alternativa de descanso (de 1 a 7): ");
  int descanso2 = scanner.nextInt();
   
 int tempo1 = matriz[origem - 1][descanso1 - 1] + matriz[descanso1 - 1][destino - 1];
 int tempo2 = matriz[origem - 1][descanso2 - 1] + matriz[descanso2 - 1][destino - 1];
 int melhor_descanso = tempo1 < tempo2 ? descanso1 : descanso2;
   System.out.println("A melhor opção de descanso é " + melhor_descanso + ".");
   scanner.close();
 }
}
