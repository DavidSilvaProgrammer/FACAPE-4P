public class Retangulo {
    public double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        
    }

    public double calcularArea() {
        return this.base * this.altura;
    }
    
    public void mostrarDados(){
        System.out.println("Area do retangulo: "+calcularArea());
    }
}
