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
