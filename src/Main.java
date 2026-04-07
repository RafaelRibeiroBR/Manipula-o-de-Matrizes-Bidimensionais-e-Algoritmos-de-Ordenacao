import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite linhas: ");
        int l = sc.nextInt();

        System.out.print("Digite colunas: ");
        int c = sc.nextInt();

        Matriz m = new Matriz(l, c);

        m.preencherAutomatico();

        System.out.println("\nMatriz original:");
        m.exibir();

        System.out.println("\nOrdenado por linhas:");
        m.ordenarLinhas();
        m.exibir();

        System.out.println("\nOrdenado por colunas:");
        m.ordenarColunas();
        m.exibir();

        System.out.println("\nOrdenado completo (Merge Sort):");
        m.ordenarMatrizCompleta();
        m.exibir();
    }
}