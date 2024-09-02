package controller;

public class QuicksortController {

    public void quickSort(int[] vetor, int início, int fim) {
        if (início < fim) {
            int pi = partition(vetor, início, fim);
            quickSort(vetor, início, pi - 1); // Antes do pivô
            quickSort(vetor, pi + 1, fim); // Depois do pivô
        }
    }

    private int partition(int[] vetor, int início, int fim) {
        int pivô = vetor[fim];
        int i = (início - 1); // Índice do menor elemento
        for (int j = início; j < fim; j++) {
            if (vetor[j] < pivô) {
                i++;
                // Troca vetor[i] e vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        // Troca vetor[i+1] com o pivô
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

    public void printArray(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}