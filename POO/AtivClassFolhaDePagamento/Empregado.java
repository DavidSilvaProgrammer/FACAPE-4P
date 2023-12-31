
abstract class Empregado
{
    //matricula (G/S), nome(G/S),salarioBase(G/S).
    
    private double matricula, salarioBase, INSS= 0.11;
    private String nome;
    
    public Empregado (double matricula, String nome, double salarioBase){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

     public double getINSS(){
         return this.INSS;
     }
     
     public void setINSS(double INSS){
         this.INSS = INSS;
     }

    
     public double getMatricula(){
         return this.matricula;
     }
     
     public void setMatricula(double matricula){
         this.matricula = matricula;
     }
    
    public String getNome(){
         return this.nome;
     }
     
    public void setNome(double nome){
         this.nome = nome;
     }
    
    public double getSalarioBase(){
         return this.salarioBase;

    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase= salarioBase;
    }
    
/*Crie um método
chamado salarioLiquido que calcula e
retorna o salario líquido do mês (salarioBase * (1-INSS)). O INSS é fixo em
0.11 (11%). O mostrarDados deve
mostrar a matricula, o nome e o salárioBase.
*/

public double salarioLiquido(){

    return this.salarioBase*(1-INSS);
}

public void mostrarDados(){
    system.out.prinln("Matricula:" + matricula+ "\n"+ "Nome: "+ nome+"\nSalario base: " salarioBase);
}

    
    
}
