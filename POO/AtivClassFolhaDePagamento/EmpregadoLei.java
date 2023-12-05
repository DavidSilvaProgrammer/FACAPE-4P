/*Crie uma classe concreta EmpregadoLei que herda as características de Empregado. A inicialização 
é conforme a classe Empregado. O método que altera o salarioBase deve ser modificado. 
Conforme a lei, o novo salário
informado (passado como parâmetro) só pode ser maior que o atual. Caso
contrário deve ser dada uma mensagem apropriada.*/

public class EmpregadoLei extends Empregado
{ 
    
    public EmpregadoLei (double matricula, String nome, double salarioBase){
        
        super(matricula, nome, salarioBase);
    }
        @Override
        public void setSalarioBase(double salarioBase){
            if (SalarioBase > this.getSalarioBase()){
            super.setSalarioBase(salarioBase);
        }else{
            System.out.println("Valor so pode ser maior que o atual, conforme a Lei\n");
        }
        
        
    }
        

}
