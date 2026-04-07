import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas linhas: ");
        int linhas = scan.nextInt();
        System.out.println("Quantas colunas: ");
        int colunas = scan.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);
        System.out.println("1 para manual | 2 para automático");
        int operacao = scan.nextInt();

        if (operacao == 1) {
            matriz.preencherManual(scan);
        } else {
            matriz.preencherAutomatico();
        }

        // matriz original
        System.out.println("\nMatriz original:");
        matriz.exibir();

        // Ordenar por linhas
        matriz.ordenarLinhas();
        System.out.println("\nMatriz ordenada por linhas:");
        matriz.exibir();

        // Ordenar por colunas
        matriz.ordenarColunas();
        System.out.println("\nMatriz ordenada por colunas:");
        matriz.exibir();

        // Ordenar toda a matriz
        matriz.ordenarCompleta();
        System.out.println("\nMatriz completamente ordenada:");
        matriz.exibir();
    }
}