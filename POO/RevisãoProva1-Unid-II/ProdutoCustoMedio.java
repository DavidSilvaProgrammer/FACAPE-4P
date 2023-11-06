class ProdutoCustoMedio extends Produto
{
	public ProdutoCustoMedio(double codigo,String nome, double quant,double custo){
		super(codigo, nome, quant,custo);
	}
	public void repor(double quantRep, double custoUnit){
		super.setCusto(((super.getQuant()*super.getCusto())+
			(quantRep*custoUnit))/(super.getQuant()+quantRep));
		super.repor(quantRep,getCusto());

}
}
