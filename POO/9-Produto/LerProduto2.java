public class LerProduto {
    public static void main(String[] args) {

        int opcao, codigo, quant, unidade;
        String nome;
        double valorUnit;

        System.out.println("Registro de produto");
        System.out.println("Digite 1. Produto com Codigo e Nome");
        System.out.println("Digite 2. Produto com Codigo, Nome e Quant");
        System.out.println("Digite 3. Produto com Codigo, Nome e Quant, Unidade e Valor Unitario");
        opcao = JUtil.readInt();

        Produto produto = null;

        switch (opcao) {
            case 1:
                System.out.println("Digite Codigo e Nome:");
                codigo = JUtil.readInt();
                nome = JUtil.readString();
                produto = new Produto(codigo, nome);
                break;
            case 2:
                System.out.println("Digite Codigo, Nome e Quant:");
                codigo = JUtil.readInt();
                nome = JUtil.readString();
                quant = JUtil.readInt();
                produto = new Produto(codigo, nome, quant);
                break;
            case 3:
                System.out.println("Codigo, Nome e Quant, Unidade e Valor Unitario:");
                codigo = JUtil.readInt();
                nome = JUtil.readString();
                quant = JUtil.readInt();
                unidade = JUtil.readInt();
                valorUnit = JUtil.readDouble();
                produto = new Produto(codigo, nome, quant, unidade, valorUnit);
                break;
        }

        if (produto != null) {
            // Verifique se um produto foi criado
            System.out.println("Produto criado com sucesso!");
        } else {
            System.out.println("Opção inválida");
        }
    }
}
