/*Um Produto contém código, nome, quantidade, unidade, valor unitário e
valor total (quantidade * valor unitário). Crie um programa que leia vários
produtos. A quantidade de produtos será informada pelo usuário.
Depois mostre os dados conforme exemplo abaixo.
No final mostre:
• Soma dos valores totais;
• Nome e valor total do produto mais valioso;*/

public class LerProduto
{
	public static void main(String[] args) throws Exception {

	    double soma=0, maisValor=0;
	    int idx=0;
	    
	    
		System.out.println("Informe n de produtos:");
		Produto p1[] = new Produto[JUtil.readInt()];
		
		for (int i=0;i<p1.length;i++){
		    p1[i] = new Produto();
		    System.out.println("Informe Codigo, Nome, Quant, Unidade, valor unitario:");
		    p1[i].codigo = JUtil.readInt();
		    p1[i].nome = JUtil.readString();
		    p1[i].quant = JUtil.readDouble();
		    p1[i].unidade = JUtil.readString();
		    p1[i].valorUnit = JUtil.readDouble();
		    p1[i].calculaTotal();
		    soma+= p1[i].valorTotal;
		    if (p1[i].valorTotal>maisValor){
		        maisValor=p1[i].valorTotal;
		        idx=i;
		    }
		}
		
		System.out.println("Soma dos valores totais: "+ soma);
		System.out.println("Codigo\tNome\tQuant\tUnid\tValorUnit\tValorTotal");
        System.out.println(p1[idx].codigo+"\t"+p1[idx].nome+"\t"+p1[idx].quant+"\t"+p1[idx].unidade+"\t"+p1[idx].valorUnit+"\t"+p1[idx].valorTotal);
        
        
		/*• Soma dos valores totais;
• Nome e valor total do produto mais valioso;

Codigo Nome Quant Unid Valor Total
*/
		
		
	}
}
