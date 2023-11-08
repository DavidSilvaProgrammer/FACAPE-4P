public abstract class MinhaClasseAbstrata {
    public abstract void meuMetodoAbstrato();
}

public class MinhaClasseConcreta extends MinhaClasseAbstrata {
    public void meuMetodoAbstrato() {
        System.out.println("Implementação do método abstrato na classe concreta.");
    }
}

public class Main {
    public static void main(String[] args) {
        MinhaClasseAbstrata minhaInstancia = new MinhaClasseAbstrata();
        minhaInstancia.meuMetodoAbstrato(); // Erro! Tentando acessar um método abstrato diretamente
    }
}
