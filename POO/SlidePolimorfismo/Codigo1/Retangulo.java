class Retangulo extends FiguraPlana {
    private float ladoa;
    private float ladob;
    
    public Retangulo (float ladoa, float ladob){
        this.ladoa = ladoa;
        this.ladob = ladob;
        }
        
    public float getLadoa (){
        return (this.ladoa);
        }
        
        
    public void setLadoa (float ladoa){
        this.ladoa = ladoa;
        }
    public float getLadob (){
        return (this.ladob);
        }
    public void setLadob (float ladob){
        this.ladob = ladob;
        }
    double area (){ // override
        return this.ladoa * this.ladob;
    }
    
    double perimetro () {// override 
    return 2 * (this.ladoa + this.ladob);
        }
    void mostrarDados () {// override
        System.out.println ("Retangulo com lados " + this.ladoa + " e " + this.ladob);
        super.mostrarDados ();
        }
    }
    
}
