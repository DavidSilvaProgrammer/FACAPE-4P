public class ExemploArrayParametro {
    public static void main(String[] args) {
        int[] meuArray = {1, 2, 3, 4, 5};
        imprimirArray(meuArray);
    }

    public static void imprimirArray(int[] array) {
        System.out.print("Elementos do array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


public class GerarNumeroAleatorio {
    public static void main(String[] args) {
        double numeroAleatorio = Math.random(); // Gera um número de ponto flutuante entre 0.0 (inclusive) e 1.0 (exclusivo)
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}


import java.util.*;

public class GerarNumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(); // Gera um número inteiro aleatório
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}

