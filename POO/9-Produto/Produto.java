/*9) Altere a classe Produto para receber no
momento da instância :
– O código e o nome ou
– O código, o nome e a quantidade ou
– O código, o nome,a quantidade, a unidade e o
valor unitário.*/

public class Produto{
    
    public String nome;
    public int codigo, quant, unidade;
    public double valorUnit;
    
    Produto(){
    
    }
    
    
    Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        System.out.println("*****\nCodigo: "+codigo+"\nNome: "+nome);
    }
    Produto(int codigo, String nome, int quant){
        this.codigo = codigo;
        this.nome = nome;
        this.quant = quant;
        System.out.println("*****\nCodigo: "+codigo+"\nNome: "+nome+"\nQuant: "+quant);
    }
    Produto(int codigo, String nome, int quant, int unidade, double valorUnit){
        this.codigo = codigo;
        this.nome = nome;
        this.quant = quant;
        this.unidade = unidade;
        this.valorUnit = valorUnit;
        System.out.println("*****\nCodigo: "+codigo+"\nNome: "+nome+"\nQuant: "+quant+"\nUnidade: "+unidade+"\nValor Unitario: "+valorUnit);
    }
    
}
