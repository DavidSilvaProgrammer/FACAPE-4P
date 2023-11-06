
class LerFuncionario
{
	public static void main(String[] args) throws Exception
	{
	System.out.println ("Quantos funcionarios ?"); 	
	Funcionario afuncionarios [] = new Funcionario[JUtil.readInt()];
	float somaSalarios = 0, recolhidoIR = 0;
	int imaior = 0;

	System.out.println ("Cadastra " + afuncionarios.length + " funcionarios");
	for (int i = 0;i<afuncionarios.length ;i++ )
	{afuncionarios[i] = new Funcionario();
	System.out.println ("Funcionario " + (i + 1));
	System.out.print ("Matricula : ");
	afuncionarios[i].matricula = JUtil.readInt ();
	System.out.print ("Nome : ");
	afuncionarios[i].nome = JUtil.readString ();
	System.out.print ("Horas trabalhadas : ");
	afuncionarios[i].horas = JUtil.readFloat ();
	System.out.print ("Valor da hora : ");
	afuncionarios[i].valor = JUtil.readFloat ();
	somaSalarios += afuncionarios[i].salarioBruto();
	recolhidoIR += afuncionarios[i].descontoImpostoRenda();
	imaior = (afuncionarios[i].salarioLiquido () > afuncionarios[imaior].salarioLiquido ()?
		i:imaior);
	}
	System.out.println ("Lista dos " + afuncionarios.length + " funcionarios");
	System.out.println ("Item\tMat\tNome\tSalario\tIR %\tIR ($)\tLiquido");
	for (int i = 0;i<afuncionarios.length ;i++ )
	{System.out.println ((i + 1) + "\t" + 
	afuncionarios[i].matricula + "\t" +
	afuncionarios[i].nome + "\t" +
	afuncionarios[i].salarioBruto() + "\t" +
	afuncionarios[i].percentualImpostoRenda () + "\t" +
	afuncionarios[i].descontoImpostoRenda ()+ "\t\t" + 
	afuncionarios[i].salarioLiquido ());
	}

	System.out.println ("Soma dos salarios = " + somaSalarios);
	System.out.println ("Recolhido para o IR = " + recolhidoIR);
	System.out.println ("Total Liquido da Folha = " + (somaSalarios - recolhidoIR));
	System.out.println ("Maior Salario Liquido = " + afuncionarios[imaior].salarioLiquido() + 
		" do funcionario " + afuncionarios[imaior].nome);

	}
}
