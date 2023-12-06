/*Crie um programa chamado FolhaPagamento. Crie um empregado com matricula 1. Nome Joao e
salário base R$ 600,00. Crie outro empregado com matricula 2, nome
Maria, salário base R$ 1000,00 e comissão 10%. Altere o salário de Joao
para 500. Mostre o salario líquido de Joao e o de Maria que vendeu neste mês R$
100,00. Altere o salário de Joao para R$ 700,00 e altere o salário de Maria
para R$ 1200,00. Mostre o salário líquido de Joao e o de Maria que vendeu neste
mês R$ 200,00.*/

public class FolhaPagamento
{
	public static void main(String[] args) {
		//MinhaClasse meuObjeto = new MinhaClasse();
		
		Empregado e1 = new Empregado(1, Joao, 600.00 );
		EmpregadoComissao e2 = new Empregado(2, Maria, 1000.00, 0.1);
		
		e1.setSalarioBase(500);
		System.out.println("Salario liquido de Joao: "+ e1.salarioLiquido());
		System.out.println("Salario liquido de Maria: "+ e2.salarioLiquido(100.00))
		
		e1.setSalarioBase(700);
		e2.setSalarioBase(1200.00);
		
		System.out.println("Salario liquido de Joao: "+ e1.salarioLiquido());
		System.out.println("Salario liquido de Maria: "+ e2.salarioLiquido(200.00))
		
		
		//public Empregado (double matricula, String nome, double salarioBase)
	}
}
