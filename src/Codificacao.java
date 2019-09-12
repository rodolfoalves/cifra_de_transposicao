public class Codificacao {

    public Codificacao(){}

    static String code(String codigo, String key){

        codigo = codigo.replace(" ","");

        if (codigo.length() % key.length() != 0){
            codigo = complete(codigo, key.length() - (codigo.length() % key.length()));
        }

        String[][] matriz = setMatriz(codigo, key);

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

    private static String[][] setMatriz(String codigo, String key){

        int linha = codigo.length()/key.length();

        String[][] matriz = new String[linha][key.length()];
        int aux = 0;

        for (int i = 0; i < key.length(); i++){
            for (int j = 0; j < key.length(); j++) {
                if (aux != codigo.length()) {
                    matriz[i][j] = String.valueOf(codigo.charAt(aux));
                    aux++;
                }else {
                    break;
                }
            }
        }

        return null;
    }

}
