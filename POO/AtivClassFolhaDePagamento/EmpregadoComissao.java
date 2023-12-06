/*Crie uma classe concreta EmpregadoComissao (com encapsulamento máximo) que herda as
características de EmpregadoLei. Um
novo atributo deve ser acrescentado, a comissão
(G/S) em %. O processo de inicialização é conforme a classe EmpregadoLei, inicializando também a
comissão. O método que calcula o salarioLiquido
deve ser modificado. Este método recebe como
parâmetro o total ($) das vendas
no mês e calcula o salário líquido do mês conforme a fórmula: (salarioLiquido +
(vendas * (comissao/100)) ). O mostrarDados
deve, além da comissão, mostrar a matrícula, o nome, o salário base e o INSS.
(Não use super mostrarDados)*/

public class EmpregadoComissao extends EmpregadoLei
{
	private double comissao=0;
	
	public double getComissao(){
	    return comissao;
	}
	
	public void setComissao(double comissao){
	    this.comissao = comissao;
	}

	EmpregadoComissao (double matricula, String nome, double salarioBase, comissao){
	    super (matricula, nome, salarioBase)
	    this.comissao= comissao;
	
	@Override   
	public double salarioLiquido(double vendas){

    return (super.salarioLiquido()+(vendas * (this.comissao/100)));
}
	    
	Override mostrarDados(){
	    System.out.println("Matricula: "+super.getMatricula()+"\nNome: "+ super.getNome()+
	    "\nSalario base:"+ super.getSalarioBase()+"\nINSS: " super.getINSS());
	}    
	    
	    
}
