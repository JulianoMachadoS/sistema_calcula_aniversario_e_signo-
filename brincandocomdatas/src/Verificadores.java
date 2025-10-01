import java.util.*;
public class Verificadores {
    public boolean ehLetradoAlfabetoAZ(char letra){
        letra = Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f' ||
                letra == 'g' || letra == 'h' || letra == 'i' || letra == 'j' || letra == 'k' || letra == 'l' ||
                letra == 'm' || letra == 'n' || letra == 'o' || letra == 'p' || letra == 'q' || letra == 'r' ||
                letra == 's' || letra == 't' || letra == 'u' || letra == 'v' || letra == 'w' || letra == 'x' ||
                letra == 'y' || letra == 'z'){
            return true;
        }
        return false;
    }
    public boolean ehVogal(char letra){
        letra = Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            return true;
        }
        return false;
    }
    public boolean ehConsoante(char letra){
        if (ehLetradoAlfabetoAZ(letra) && ehVogal(letra)) {
            return false;
        }
        return true;
    }
    public boolean ehNumero(char letra){
        letra = Character.toLowerCase(letra);
        if (letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' ||
                letra == '6' || letra == '7' || letra == '8' || letra == '9' || letra == '0' ){
            return true;
        }
        return false;
    }
    public boolean ehSimbulo (char letra){
        letra = Character.toLowerCase(letra);
        if (ehLetradoAlfabetoAZ(letra) || letra == ' ' || ehNumero(letra)){
            return false;
        }
        return true;
    }
    public boolean ehEspaco(char letra){
        letra = Character.toLowerCase(letra);
        if (letra == ' '){
            return true;
        }
        return false;
    }
    public boolean ehVirgula(char letra){
        if(letra == ','){
            return true;
        }
        return false;
    }
}
