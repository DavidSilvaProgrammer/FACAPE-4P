import java.io.*;

public class InputComDataInputStream {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = Integer.parseInt(input.readLine());
        
        System.out.println("Você digitou o número inteiro: " + numero);
    }
}


*************************

            import java.util.Scanner;

public class InputComScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        
        System.out.println("Você digitou o número inteiro: " + numero);
    }
}



******************************

public class JUtil {
    public static int readInt() {
        // Implemente seu próprio método de entrada de inteiros aqui
        // Pode ser usando DataInputStream ou outra técnica de sua escolha
        return 0; // Substitua pelo valor lido
    }
}

public class InputComJUtil {
    public static void main(String[] args) {
        int numero = JUtil.readInt();
        
        System.out.println("Você digitou o número inteiro: " + numero);
    }
}


****************************

//Para String:

import java.util.Scanner;

public class InputStringComScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String texto = input.nextLine();
        
        System.out.println("Você digitou a string: " + texto);
    }
}


************************

public class JUtil {
    public static String readString() {
        // Implemente seu próprio método de entrada de strings aqui
        // Pode ser usando DataInputStream ou outra técnica de sua escolha
        return ""; // Substitua pela string lida
    }
}

public class InputStringComJUtil {
    public static void main(String[] args) {
        String texto = JUtil.readString();
        
        System.out.println("Você digitou a string: " + texto);
    }
}
