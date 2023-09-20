public class Pessoa {
    String nome;
    int idade;

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Alice";
        pessoa1.idade = 30;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
    }
}

************************
//Como usar método:

public class MinhaClasse {
    // Método simples que não recebe parâmetros e não retorna valor (void)
    public void saudacao() {
        System.out.println("Olá, mundo!");
    }

    // Método que recebe dois números inteiros como parâmetros e retorna a soma deles
    public int somar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args) {
        MinhaClasse objeto = new MinhaClasse();

        objeto.saudacao(); // Chamando o método saudacao
        int soma = objeto.somar(5, 3); // Chamando o método somar com parâmetros e armazenando o resultado em uma variável
        System.out.println("A soma é: " + soma);
    }
}

