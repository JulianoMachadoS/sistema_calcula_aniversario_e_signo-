/*
  Nome: Juliano Machado da Silva
  Numero de Matriculo: 25108646-8
*/

public class Removedores {
    Verificadores vr = new Verificadores();
    public String removeEspacosDuplos(String texto){
        for (int i = 0 ; i < texto.length() - 1; i++){
            if (texto.charAt(i) == ' ' && texto.charAt(i+1) == ' '){
                texto = texto.substring(0,i) + texto.substring(i+1);
                i--;
            }
        }
        return texto;
    }
    public String removeEspacosInicioFim (String texto){
        //texto = texto.trim(); faz a mesma coisa que o metodo a baixo:
        for (int i = 0 ; i < texto.length(); i++){
            if (i ==0 && texto.charAt(i) == ' '){
                texto = texto.substring(i+1);
                i--;
            }
        }
        for (int j = texto.length()-1; j > 0; j--){
            if (texto.charAt(j) == ' '){
                texto = texto.substring(0,j);
            } else {
                j = -1;
            }
        }
        return texto;
    }
    public String removeEspacos(String texto){
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' '){
                texto = texto.substring(0,i) + texto.substring(i+1);
                //texto.substring(0,i) vai até o local do espaço e cria uma substring
                //texto.substring(i+1); inicia a partir do espaço +1
                i--;
            }
        }
        return texto;
    }
    public String removeNumeros (String texto){
        for(int i = 0; i < texto.length()-1; i++ ){
            if(vr.ehNumero(texto.charAt(i))){
                texto = texto.substring(0,i) + texto.substring(i+1);
                i--;
            }
        }
        return texto;
    }
    public String removeSimbulos(String texto){
        for (int i=0; i < texto.length(); i++){
            if (vr.ehSimbulo(texto.charAt(i))){
                texto = texto.substring(0,i) + texto.substring(i+1);
                i--;
            }
        }
        return texto;
    }
    public String removeLetras(String texto){
        for (int i=0; i < texto.length(); i++){
            if (vr.ehLetradoAlfabetoAZ(texto.charAt(i))){
                texto = texto.substring(0,i) + texto.substring(i+1);
                i--;
            }
        }
        return texto;
    }
}
