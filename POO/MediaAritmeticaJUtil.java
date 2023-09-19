import java.lang.*;
import java.io.*;




class MediaAritmeticaJUtil {
    public static void main(String[] args) throws Exception {
        int a, b;
        double c;

        System.out.println("Digite os valores dos dois catetos: ");
        a = JUtil.readInt();
        b = JUtil.readInt();

        c = Math.sqrt(a * a + b * b);

        System.out.println("Resultado da hipotenusa: " + c);

        JUtil.pause ();
    }
}
