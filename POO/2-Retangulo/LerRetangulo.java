class LerRetangulo{

/*Exercícios Propostos
n 1) Altere a classe Retângulo criando um
construtor que receba e inicialize a base e altura.
Depois crie um programa que crie o objeto
passando estes parâmetros. Sair quando a base
do for zero.*/    

public static void main(String[] args) throws Exception { 

Retangulo r1;

double base,altura;

System.out.println("Calcular area do retangulo:");

do {
    System.out.println("Informe a base e a altura do retangulo");
    base = JUtil.readDouble();
    if (base == 0){
        System.out.println("Programa encerrado");
        System.exit(0);
    }
    altura =JUtil.readDouble();
    r1 = new Retangulo(base, altura);
    r1.mostrarDados();
    
} while(true);
}
}


