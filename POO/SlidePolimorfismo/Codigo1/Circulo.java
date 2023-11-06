class Circulo extends FiguraPlana {
    private float raio;
    public Circulo (float raio){
        this.raio = raio;
        }
    public void setRaio (float raio){
        this.raio = raio;
        }
    public float getRaio (){
        return (this.raio);
        }
    float diametro () {// Método exclusivo
        return raio * 2f;
        }
    double area (){ // override
    return Math.PI * Math.pow (this.raio,2);
        }
    double perimetro (){ // override
    return (this.comprimento ());
        }
    double comprimento (){ // Método exclusivo
        return 2 * Math.PI * this.raio;
        }
        
        double area (float comprimento){ // em PI
            float raio; // Método exclusivo
            raio = comprimento / 2 ;
            return (Math.pow (raio,2)); 
            }
            
        void mostrarDados (){ // override    
            System.out.println ("\nInformacoes do "+
            "circulo de raio " + this.raio);
            super.mostrarDados ();
            System.out.println ("\nDiametro = " +
            this.diametro());
            }
}
