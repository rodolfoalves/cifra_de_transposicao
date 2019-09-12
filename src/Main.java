import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Frase para codificar");
        String codigo = in.nextLine();

        System.out.println("Key");
        String key= in.nextLine();

        String palavra_codificada = Codificacao.code(codigo,key);


    }
}
