public class Codificacao {

    public Codificacao(){}

    static String code(String codigo, String key){

        int aux = 0;

        codigo = codigo.replace(" ","");

        if (codigo.length() % key.length() != 0){
            codigo = complete(codigo, key.length() - (codigo.length() % key.length()));
        }

        String[][] matriz = setMatriz(codigo, key.length());


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
