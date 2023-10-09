public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public void mostrarDados(){
        System.out.println("Area do circulo: "+calcularArea());
    }
}
