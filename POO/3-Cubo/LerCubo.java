/*2) Altere a Classe Cubo criando um construtor
que receba e inicialize a aresta. Depois crie um
programa que crie o objeto passando este
parâmetro. Sair quando a base do for zero.*/

public class LerCubo
{
	public static void main(String[] args)throws Exception{
	    double arresta;
	    Cubo c1;
	    
	    System.out.println("Programa para calcular volume do cubo\nInforme o valor da arresta:");
	    arresta = JUtil.readDouble();
	    
	    while (arresta != 0){
	        c1 = new Cubo(arresta);
	        System.out.println("Volume do cubo: "+ c1.calculaVolume());
	        System.out.println("Informe o valor da arresta:");
	        arresta = JUtil.readDouble();
	    }
	    System.out.println("Programa encerrado");
	    
	}
}
