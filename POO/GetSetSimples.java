public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método get para obter o valor do atributo 'nome'
    public String getNome() {
        return nome;
    }

    // Método set para definir o valor do atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método get para obter o valor do atributo 'idade'
    public int getIdade() {
        return idade;
    }

    // Método set para definir o valor do atributo 'idade'
    public void setIdade(int idade) {
        // Pode-se adicionar validações aqui, se necessário
        this.idade = idade;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 25);

        // Obtendo valores usando métodos get
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Modificando valores usando métodos set
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        // Obtendo os novos valores
        System.out.println("Novo Nome: " + pessoa.getNome());
        System.out.println("Nova Idade: " + pessoa.getIdade());
    }
}
