public class PreencherMatriz {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;

        // Criar uma matriz de inteiros com o tamanho especificado
        int[][] matriz = new int[linhas][colunas];

        // Preencher a matriz usando um loop for
        int valor = 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Imprimir a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Avançar para a próxima linha
        }
    }
}
