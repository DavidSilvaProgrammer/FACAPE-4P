class TipoFogo extends Pokemon{
    private String apelido;
    public TipoFogo(String nome, String tipo, String persona, int nivel, int numEvolucao, String apelido){
        super( nome,  tipo,  persona,  nivel, numEvolucao);
        this.apelido = apelido;

    }
    @Override
    public void mostrarDados(){
        System.out.println("\nPokemon do tipo fogo:");
        System.out.println("Apelido entre tipos de fogo: "+this.apelido);
        super.mostrarDados();
    }
    
    @Override
    public void atacar(){
        System.out.println("Hora do ataque:");
        System.out.println(this.getNome()+" dispara ataque de fogo!");
    }
    
}
