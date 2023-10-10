/*
m Aluno contém código, nome, nota1, nota2, nota3. 
Crie comportamentos (métodos) :
Media : calcula a media das 3 notas :
((nota1 + nota2 + nota3) / 3)
Media : calcula a media das 3 notas recebendo os três pesos (peso1,peso2,.peso2)
como parâmetro :
((nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3))
Crie um programa que leia vários alunos. A quantidade de alunos será informada pelo usuário.
*/

public class Aluno{
    public int codigo;
    public String nome;
    public double nota1,nota2,nota3, media1,media2;
    
    public void media(){
        this.media1 = (nota1 + nota2 + nota3) / 3;
    }
    
    public void media(double peso1, double peso2, double peso3){
        this.media2 = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }
    
    
    
}
