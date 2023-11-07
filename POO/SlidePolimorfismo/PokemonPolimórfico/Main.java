import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception{
	    Scanner input = new Scanner(System.in);
	    
	    String nome, tipo, persona, apelido;
	    int nivel, numEvolucao,opcao=0;
	    
	 
	    
	    System.out.println("Informe o tipo Pokemon. Fogo 1 e Agua 0:");
	    opcao = input.nextInt();
	    if (opcao == 1){
	        System.out.println("Informe o numero de pokemon:");
		    Pokemon p1[] = new TipoFogo[input.nextInt()];
		    input.nextLine();
		    for(int i=0;i<p1.length;i++){
		    System.out.println("\nInforme nome, tipo, personalidade, nivel, n evolucao e apelido na ordem:");
		    
		    nome = input.nextLine();
		    tipo = input.nextLine();
		    persona = input.nextLine();
		    nivel = input.nextInt();
		    numEvolucao = input.nextInt();
		    input.nextLine();
		    apelido = input.nextLine();
		    
		    p1[i] = new TipoFogo(nome, tipo, persona, nivel, numEvolucao, apelido);
		    }
		    for(int i=0;i<p1.length;i++){
	            p1[i].mostrarDados();
	            p1[i].atacar();
		    
	            }
		        
	   }else{
	        System.out.println("\nInforme o numero de pokemon:");
	        Pokemon p1[] = new TipoAgua[input.nextInt()];
	        input.next();
	        
	        for(int i=0;i<p1.length;i++){
		    System.out.println("Informe nome, tipo, personalidade, nivel, n evolucao e apelido na ordem:");
		    
		    
		    nome = input.nextLine();
		    tipo = input.nextLine();
		    persona = input.nextLine();
		    nivel = input.nextInt();
		    numEvolucao = input.nextInt();
		    input.next();
		    apelido = input.nextLine();
		    
		    p1[i] = new TipoAgua(nome, tipo, persona, nivel, numEvolucao, apelido);
	        }
	        
	        for(int i=0;i<p1.length;i++){
	            p1[i].mostrarDados();
	            p1[i].atacar();
	        
	        }
	        
	            
		}
    }
}
