class MovimentoEstoque
{
	public static void main(String[] args) 
	{
		ProdutoCustoAtual pca = new ProdutoCustoAtual(1,"Feijao", 60, 1.50);
		ProdutoCustoMedio pcm = new ProdutoCustoMedio(2,"Tomate", 120, 2.50);
		
		pca.mostrarDados();
		pcm.mostrarDados();

		pca.repor(100,1.60);
		pcm.repor(100,2.60);

		pca.mostrarDados();
		pcm.mostrarDados();
		
		pca.baixar(30);
		pcm.baixar(50);

		pca.mostrarDados();
		pcm.mostrarDados();

	}
}
