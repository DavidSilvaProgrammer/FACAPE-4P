abstract class Produto
{
	private double codigo, quant, custo;
	private String nome;

	public Produto(double codigo, String nome, double quant, double custo){
		this.codigo = codigo;
		this.nome = nome;
		this.quant = quant;
		this.custo = custo;
	}


	public double getCodigo(){
		return (this.codigo);
	}
	public void setCodigo(double codigo){
		this.codigo = codigo;
	}
	
	public String getNome(){
		return (this.nome);
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getQuant(){
		return (this.quant);
	}
	public double getCusto(){
		return (this.custo);
	}
	public void setCusto(double Custo){
		this.custo = custo;
	}
	
	public double getValorEstoque(){
		return (quant*custo);
	}
	public void repor(double quantRep, double custoUnit){
		this.quant=(this.quant+quantRep);
	}
	public boolean validarSaldo (double outraQuant){
		return (this.quant >= outraQuant);
	}
	public void baixar(double outraQuant){
		if (this.validarSaldo(outraQuant)){
			this.quant-= outraQuant;
		}else{
			System.out.println("Erro. Quantidade superior a do estoque.");
		}
	}

	public void mostrarDados(){
		System.out.println("Codigo: "+ this.codigo+"\nNome: "+
			this.nome+"\nQuantidade: "+
			this.quant+"\nCusto: "+this.custo+
			"Valor do estoque"+this.getValorEstoque());
	}
}

	
