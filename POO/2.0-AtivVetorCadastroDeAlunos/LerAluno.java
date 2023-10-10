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

public class LerAluno
{
	public static void main(String[] args) throws Exception {
	    
        double p1,p2,p3,soma=0,mediaMedia, menor=Double.MAX_VALUE, maior=0;
        int idxMaior=0,idxMenor=0;
	    
		System.out.println("Digite a quantidade de alunos:");
		Aluno[] alunos = new Aluno[JUtil.readInt()];
		
		for (int i=0; i< alunos.length; i++){
		    alunos[i] = new Aluno();
		    System.out.println("Aluno "+ (i+1) + ".Digite Codigo, Nome, Notas 1,2,3:");
		    alunos[i].codigo = JUtil.readInt();
		    alunos[i].nome = JUtil.readString();
		    alunos[i].nota1 = JUtil.readDouble();
		    alunos[i].nota2 = JUtil.readDouble();
		    alunos[i].nota3 = JUtil.readDouble();
		    System.out.println("Agora digite os pesos das Notas 1,2 e 3:");
		    p1 = JUtil.readDouble();
		    p2 = JUtil.readDouble();
		    p3 = JUtil.readDouble();
            alunos[i].media(p1,p2,p3);
		    soma+=alunos[i].media2;
		    
		    if (alunos[i].media2 < menor){
		        menor=alunos[i].media2;
		        idxMenor= i;
		    }
		    if (alunos[i].media2 > maior){
		        maior=alunos[i].media2;
		        idxMaior=i;
		    }
		}
		mediaMedia = soma / alunos.length;
		System.out.println("Media das medias: "+mediaMedia);
		System.out.println("Codigo\tNome\tNota1\tNota2\tNota3\tMedia");
		System.out.println(alunos[idxMaior].codigo+"\t"+alunos[idxMaior].nome+"\t"+alunos[idxMaior].nota1+"\t"+alunos[idxMaior].nota2+"\t"+alunos[idxMaior].nota3+"\t"+alunos[idxMaior].media2);
		System.out.println(alunos[idxMenor].codigo+"\t"+alunos[idxMenor].nome+"\t"+alunos[idxMenor].nota1+"\t"+alunos[idxMenor].nota2+"\t"+alunos[idxMenor].nota3+"\t"+alunos[idxMenor].media2);
		System.out.println((alunos[idxMaior].media2+alunos[idxMenor].media2)/2.0);
		
		
		
	}
}
