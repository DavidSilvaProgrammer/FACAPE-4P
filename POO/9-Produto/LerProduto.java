/*9) Altere a classe Produto para receber no
momento da instância :
– O código e o nome ou
– O código, o nome e a quantidade ou
– O código, o nome,a quantidade, a unidade e o
valor unitário.*/

public class LerProduto{
    public static void main(String[] args) throws Exception{
        
        int opcao, codigo, quant, unidade;
        String nome;
        double valorUnit;
        
        
        System.out.println("Registro de produto");
        System.out.println("Digite 1. Produto com Codigo e Nome");
        System.out.println("Digite 2. Produto com Codigo, Nome e Quant");
        System.out.println("Digite 3. Produto com Codigo, Nome e Quant, Unidade e Valor Unitario");
        opcao = JUtil.readInt();
        
        switch (opcao){
            case 1:
                System.out.println("Digite Codigo e Nome:");
                codigo = JUtil.readInt();
                nome = JUtil.readString();
                Produto p1 = new Produto(codigo, nome);
                break;
            case 2:
                System.out.println("Digite Codigo, Nome e Quant:");
                codigo = JUtil.readInt();
                nome = JUtil.readString();
                quant = JUtil.readInt();
                Produto p2 = new Produto(codigo, nome, quant);
                break;
            case 3:
                System.out.println("Codigo, Nome e Quant, Unidade e Valor Unitario:");
                codigo = JUtil.readInt();
                nome = JUtil.readString();
                quant = JUtil.readInt();
                unidade = JUtil.readInt();
                valorUnit = JUtil.readDouble();
                Produto p3 = new Produto(codigo, nome, quant, unidade, valorUnit);
                break;
        }
        if (opcao > 3 || opcao < 1){
            System.out.println("Digito inválido");
        }
        
        
    }
}

