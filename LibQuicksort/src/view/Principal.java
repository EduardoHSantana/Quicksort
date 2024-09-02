package view;

import controller.QuicksortController;

public class Principal {

    public static void main(String[] args) {
        QuicksortController quickSort = new QuicksortController();

        // Exemplo 1: Vetor [74, 20, 74, 87, 81, 16, 25, 99, 44, 58]
        int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        System.out.println("Vetor 1 antes da ordenação:");
        quickSort.printArray(vetor1);
        quickSort.quickSort(vetor1, 0, vetor1.length - 1);
        System.out.println("Vetor 1 após a ordenação:");
        quickSort.printArray(vetor1);
        
        // Exemplo 2: Vetor [44, 43, 42, 41, 40, 39, 38]
        int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
        System.out.println("Vetor 2 antes da ordenação:");
        quickSort.printArray(vetor2);
        quickSort.quickSort(vetor2, 0, vetor2.length - 1);
        System.out.println("Vetor 2 após a ordenação:");
        quickSort.printArray(vetor2);

        // Exemplo 3: Vetor [31, 32, 33, 34, 99, 98, 97, 96]
        int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
        System.out.println("Vetor 3 antes da ordenação:");
        quickSort.printArray(vetor3);
        quickSort.quickSort(vetor3, 0, vetor3.length - 1);
        System.out.println("Vetor 3 após a ordenação:");
        quickSort.printArray(vetor3);
    }
}