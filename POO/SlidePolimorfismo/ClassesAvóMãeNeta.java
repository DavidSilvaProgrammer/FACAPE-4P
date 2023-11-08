class Avo {
    int atributoAvo = 1;

    void metodoAvo() {
        System.out.println("Método da classe avó");
    }
}

class Mae extends Avo {
    int atributoMae = 2;

    void metodoMae() {
        System.out.println("Método da classe mãe");
    }
}

class Neta extends Mae {
    int atributoNeta = 3;
    int atributoMae = 5;

    void metodoNeta() {
        System.out.println("Método da classe neta");
    }
}


public class ExemploHeranca
{
	public static void main(String[] args) throws Exception {
		Neta n = new Neta();
        
        // A neta herda os atributos e métodos da avó e da mãe
        System.out.println(n.atributoAvo); // Acesso ao atributo da classe avó
        n.metodoAvo();                    // Chamada do método da classe avó

        System.out.println(n.atributoMae); // Acesso ao atributo da classe mãe
        n.metodoMae();                    // Chamada do método da classe mãe

        System.out.println(n.atributoNeta); // Acesso ao atributo da classe neta
        n.metodoNeta();
	}
}


