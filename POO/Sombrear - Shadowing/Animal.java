class Animal {
    public int banana=1, tomate=3;
    
    public void banana(){
        System.out.println("Abacaxi");
    }
    
    void emitirSom() {
        System.out.println("O animal emite algum som."+ this.banana +"e"+this.tomate);
        
        this.banana();
        banana();
    }
    
    
}
