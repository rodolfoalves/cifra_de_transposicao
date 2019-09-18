import java.util.ArrayList;

public class Codificacao {

    public Codificacao(){}

    static String code(String codigo, String key){

        int aux1 = 0;

        codigo = codigo.replace(" ","");
        String palavraCodificada = new String("");
        ArrayList<String> aux = new ArrayList<String>(); // Create an ArrayList object


        if (codigo.length() % key.length() != 0){
            codigo = complete(codigo, key.length() - (codigo.length() % key.length()));
        }

        String[][] matriz = setMatriz(codigo, key.length());

        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < codigo.length()/key.length(); j++) {
            aux.add(matriz[j][i]);
            }
        }




//        for (int i = 0; i < codigo.length()/key.length(); i++) {
//            System.out.print("\n");
//            for (int j = 0; j < key.length(); j++) {
//                System.out.print(matriz[i][j] +" ");
//            }
//        }

//        for (int i = 0; i < key.length(); i++) {
//            for (int j = 0; j < codigo.length()/key.length(); j++) {
//                aux.add(matriz[j][i]);
//            }
//        }


//        do {
//            for (int i = 0; i < key.length(); i++) {
//                for (int j = 0; j < codigo.length()/key.length(); j++) {
//                    if (key.charAt(i) == j){
//                        for (int k = 0; k < codigo.length()/key.length();k++){
//                            System.out.println(matriz[k][key.charAt(i)]);
//                            palavraCodificada.concat(matriz[k][key.charAt(i)]);
//                        }
//                        aux1++;
//                    }else {
//                        System.out.println("erroElse");
//                    }
//
//                    System.out.println("erroforDentro");
//                }
//
//                System.out.println("erroforFora");
//            }
//        }while (aux1 != key.length());

        return null;
    }

    private static String complete(String palavraParaCompletar, int size){

        String[] aux = new String[7];
        aux[0] = "a";aux[1] = "b";aux[2] = "c";aux[3] = "d";aux[4] = "e";aux[5] = "f";aux[6] = "g";

        for (int i = 0; i < size; i++){
            palavraParaCompletar = palavraParaCompletar.concat(aux[i]);
        }

        return palavraParaCompletar;
    }

    private static String[][] setMatriz(String codigo, int keyLengh){

        int linha = codigo.length()/keyLengh;

        String[][] matriz = new String[linha][keyLengh];

        int aux = 0;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < keyLengh; j++) {
                matriz[i][j] = String.valueOf(codigo.charAt(aux));
                aux++;
            }
        }
        return matriz;
    }

}
