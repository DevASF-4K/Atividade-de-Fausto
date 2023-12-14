import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int linhas = 4;
        int colunas = 7;
        int[][] temperaturas = new int[linhas][colunas];

        Random rand = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                temperaturas[i][j] = rand.nextInt(50); 
            }
        }

        String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};


      System.out.println("Temperaturas registradas:");

      System.out.print("        ");
      for (String dia : diasDaSemana) {
          System.out.printf("%-8s", dia);
      }
      System.out.println();


        for (int i = 0; i < linhas; i++) {
            System.out.printf("Semana %d: ", i + 1);
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%-8d", temperaturas[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMédia de cada dia:");
        for (int j = 0; j < colunas; j++) {
            double soma = 0;
            for (int i = 0; i < linhas; i++) {
                soma += temperaturas[i][j];
            }
            double media = soma / linhas;
            System.out.println(diasDaSemana[j] + ": " + media);
        }

      double soma = 0;
        int totalElementos = temperaturas.length * temperaturas[0].length;
        for (int i = 0; i < temperaturas.length; i++) {
        for (int j = 0; j < temperaturas[i].length; j++) {
        soma += temperaturas[i][j];
          }
        }
        double mediaGeral = soma / totalElementos;
        System.out.printf("\nMédia Geral: %.2f\n", mediaGeral);
      }
    }
