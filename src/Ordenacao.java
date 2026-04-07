public class Ordenacao {

    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(vetor, inicio, meio);

            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                temp[k] = vetor[i];
                i++;
            } else {
                temp[k] = vetor[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            temp[k] = vetor[i];
            i++;
            k++;
        }

        while (j <= fim) {
            temp[k] = vetor[j];
            j++;
            k++;
        }

        for (i = inicio, k = 0; i <= fim; i++, k++) {
            vetor[i] = temp[k];
        }
    }


}