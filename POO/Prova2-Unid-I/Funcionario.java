class Funcionario
{int matricula;
String nome;
float horas;
float valor; 

float salarioBruto ()
{return (this.horas * this.valor);}

float percentualImpostoRenda ()
{float percentual;
float sb = this.salarioBruto();
if (sb > 1500)
{percentual = 15;}
else
{if (sb > 500 && sb <= 1500)
{percentual = 8;}
else
{percentual = 0;}
}
return percentual;}

float descontoImpostoRenda (float percentual)
{return (this.salarioBruto() * percentual / (float)100);}

float descontoImpostoRenda ()
{return (this.salarioBruto() * this.percentualImpostoRenda () / (float)100);}


float salarioLiquido ()
{return (this.salarioBruto () - this.descontoImpostoRenda());}

void mostrarDados()
{System.out.println ("Matriula " + this.matricula);
System.out.println ("Nome " + this.nome);
System.out.println ("Quantidade de Horas " + this.horas);
System.out.println ("Valor da hora " + this.valor);
System.out.println ("Percentual  IR " + this.percentualImpostoRenda ());
System.out.println ("Desconto IR " + this.descontoImpostoRenda ());
System.out.println ("Salario Liquido " + this.salarioLiquido ());

}

}
