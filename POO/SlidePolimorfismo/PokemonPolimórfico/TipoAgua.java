class TipoAgua extends Pokemon{
    private String apelido;
    public TipoAgua(String nome, String tipo, String persona, int nivel, int numEvolucao, String apelido){
        super( nome,  tipo, persona,  nivel,  numEvolucao);
        this.apelido = apelido;
    }
    @Override
    public void mostrarDados(){
        System.out.println("\nPokemon do tipo agua:");
        System.out.println("Apelido entre tipos de agua: "+this.apelido);
        super.mostrarDados();
    }
    
    @Override
    public void atacar(){
        System.out.println("Hora do ataque:");
        System.out.println(this.getNome()+" dispara ataque de agua!");
    }
    
}
