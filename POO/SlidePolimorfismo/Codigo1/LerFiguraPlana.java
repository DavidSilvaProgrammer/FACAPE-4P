class LerFiguraPlana{

    public static char lerTipo () throws Exception{
        char tipo;
        do{
            System.out.print ("\nInforme 'R' para Retangulo,'C' para Circulo ou 'F' para Fim-> ");
            tipo = JUtil.readChar ();
                } while ((tipo != 'R') && (tipo != 'C') && (tipo != 'F'));
                return (tipo);
        }
    
    public static void main(String[] args) throws Exception{ 
        FiguraPlana fp = new FiguraPlana () ;
        char tipo; // Retangulo ou Circulo
        System.out.println ("Dados da Figura Plana");
        tipo = lerTipo ();
        while (tipo != 'F'){
            switch ( tipo){
                case 'R':{
                    fp = new Retangulo(0,0);
                    System.out.print ("\nInforme a base -> ");
                    ((Retangulo) fp).setLadoa (JUtil.readFloat());
                    System.out.print ("\nInforme a largura -> ");
                    ((Retangulo) fp).setLadob (JUtil.readFloat());
                        break;
                }
                case 'C':{
                    fp = new Circulo(0);
                    System.out.print ("\nInforme o raio -> ");
                    ((Circulo) fp).setRaio (JUtil.readFloat ());
                    break;
                }
            } // switch
            
            fp.mostrarDados (); // polimorfismo aqui
            if ( fp instanceof Circulo ){ 
                System.out.println ("\n Area em PI do "+"circulo com comprimento 20 PI "+ 
                ((Circulo)fp).area (20));
            }
        tipo = lerTipo ();
        } // while
    } // main
 } // class
                
