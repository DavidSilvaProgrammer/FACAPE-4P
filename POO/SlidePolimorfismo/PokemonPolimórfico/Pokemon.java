class Pokemon{
    private String tipo, nome, persona;
    private int nivel, numEvolucao;
    
    public Pokemon(String nome, String tipo, String persona, int nivel, int numEvolucao){
        this.nome = nome;
        this.tipo = tipo;
        this.persona = persona;
        this.nivel = nivel;
        this.numEvolucao = numEvolucao;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void atacar(){
        System.out.println(nome+" dispara um ataque comum!");
    }
    
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Personalidade: "+persona);
        System.out.println("Nivel: "+nivel);
        System.out.println("Numero de evolucao: "+numEvolucao+"\n");
        
    }
    
}
