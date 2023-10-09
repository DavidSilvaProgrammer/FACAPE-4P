class LerCirculo{
    
public static void main(String[] args) throws Exception { 

Circulo circulo1;
double raio=0;

System.out.println ("Dados do Circulo" );

do{
System.out.print ("\nInforme o raio -> ");
raio = JUtil.readFloat ();

circulo1 = new Circulo(raio);

if (circulo1.raio != 0) {
                circulo1.mostrarDados();
            }

} while (circulo1.raio != 0);
}
}


