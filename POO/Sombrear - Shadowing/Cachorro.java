class Cachorro extends Animal {
    public int banana=0,tomate=0;
    

    
    @Override
    void emitirSom() {
        
        System.out.println("O cachorro late!" + super.banana+ "e"+super.tomate+"e"+banana);
        super.emitirSom(); // Chama o método da superclasse
    }
    
    public void banana(){
        System.out.println("Melancia");
        super.banana();
        System.out.println("banana: "+ banana+"\t"+"tomate: "+tomate);
    }
    
}
