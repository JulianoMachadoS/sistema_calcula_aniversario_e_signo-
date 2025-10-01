public class Contadores {
    Verificadores vr = new Verificadores();

    public int contaCaracteres (String texto){
        int contador = 0;
        for (int i=0 ; i < texto.length();i++){
            if (vr.ehEspaco(texto.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public int contaLetras (String texto){
    int contador = 0;
        for (int i=0 ; i < texto.length();i++){
            if (vr.ehLetradoAlfabetoAZ(texto.charAt(i))){
            contador++;
            }
        }
    return contador;
    }
    public int contaVogais (String texto){
        int contador = 0;
        for (int i=0 ; i < texto.length();i++){
            if (vr.ehVogal(texto.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public int contaConsoantes (String texto){
        int contador = 0;
        for (int i=0 ; i < texto.length();i++){
            if (vr.ehConsoante(texto.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public int contaSimbolos (String texto){
        int contador = 0;
        for (int i=0 ; i < texto.length();i++){
            if (vr.ehSimbulo(texto.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public int contaNumeros (String texto){
        int contador = 0;
        for (int i=0 ; i < texto.length();i++){
            if (vr.ehNumero(texto.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
}
