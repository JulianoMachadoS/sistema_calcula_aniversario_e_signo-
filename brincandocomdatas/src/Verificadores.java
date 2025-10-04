/*
  Nome: Juliano Machado da Silva
  Numero de Matriculo: 25108646-8
*/

import java.util.*;
import java.util.Date;

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
        if (ehLetradoAlfabetoAZ(letra) && !ehVogal(letra)) {
            return true;
        }
        return false;
    }
    public boolean ehPalindromo(String nome, String nomeInvertido) {
        return nomeInvertido.equals(nome);
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
    public boolean ehDataValida (int dia, int mes, int ano){
        Date dt = new Date();
        int diaAatual = dt.getDate();
        int mesAtual = dt.getMonth() +1;
        int anoAtual = dt.getYear() + 1900;

        if (ano < 1900){
            return false;
        }
        if(dia >= 32){
            return false;
        }
        if (mes >= 13){
            return false;
        }
        if (ano > anoAtual) {
            return false;
        }

        if(  !(mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                mes== 8 || mes == 10 || mes == 12) && dia == 31){
                return false;
        }

        if (mes == 2 ){
            if ( !ehAnoBissexto(ano) && dia == 29 ){
                return false;
            }
        }

        if ( ano == anoAtual){
            if (mes == mesAtual){
                if (dia >= diaAatual){
                    return false;
                }
            } else if (mes > mesAtual) {
                return  false;
            }

        }
        return true;
    }
    public boolean ehAnoBissexto (int ano){
        if (ano % 400 == 0){
            return true;
        }
        return false;
    }
}
