import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.matriz = new int[linhas][colunas];
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public void preencherManual(Scanner scan) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    public void preencherAutomatico() {
        Random r = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }
    }

    public void exibir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void ordenarLinhas() {
        for (int i = 0; i < linhas; i++) {
            Ordenacao.bubbleSort(matriz[i]);
        }
    }

    public void ordenarColunas() {
        for (int i = 0; i < colunas; i++) {
            int[] coluna = new int[linhas];
            for (int j = 0; j < linhas; j++) {
                coluna[j] = matriz[j][i];
            }
            Ordenacao.bubbleSort(coluna);
            for (int j = 0; j < linhas; j++) {
                matriz[j][i] = coluna[j];
            }
        }
    }

    public void ordenarCompleta() {
        int[] vetor = new int[linhas * colunas];
        int k = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[k] = matriz[i][j];
                k++;
            }
        }
        Ordenacao.mergeSort(vetor, 0, vetor.length - 1);
        k = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = vetor[k];
                k++;
            }
        }
    }


}