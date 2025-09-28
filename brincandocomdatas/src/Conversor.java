public class Conversor {
    //dia para simbulo
    public char diaParaSimbulo (char numero1, char numero2){
        char valorSimobul = 0;
        if (numero1 == '0'){// dias 01~09
            if (numero2 == '1'){
                return '1';
            } else if (numero2 == '2') {
                return '2';
            } else if (numero2 == '3') {
                return '3';
            } else if (numero2 == '4'){
                return '4';
            } else if (numero2 == '5' ) {
                return '5';
            } else if (numero2 == '6') {
                return '6';
            } else if (numero2 == '7') {
                return '7';
            } else if (numero2 == '8') {
                return '8';
            } else if (numero2 == '9') {
                return '9';
            }
        } else if (numero1 == '1') { // dias 10~19
            if(numero2== '0'){
                return '0';
            } else if (numero2 == '1'){
                return 'a';
            } else if (numero2 == '2') {
                return 'b';
            } else if (numero2 == '3') {
                return 'c';
            } else if (numero2 == '4'){
                return 'd';
            } else if (numero2 == '5' ) {
                return 'e';
            } else if (numero2 == '6') {
                return 'f';
            } else if (numero2 == '7') {
                return 'g';
            } else if (numero2 == '8') {
                return 'h';
            } else if (numero2 == '9') {
                return 'i';
            }
        } else if (numero1 == '2') { // dias 20~29
            if(numero2== '0'){
                return 'j';
            } else if (numero2 == '1'){
                return 'k';
            } else if (numero2 == '2') {
                return 'l';
            } else if (numero2 == '3') {
                return 'm';
            } else if (numero2 == '4'){
                return 'n';
            } else if (numero2 == '5' ) {
                return 'o';
            } else if (numero2 == '6') {
                return 'p';
            } else if (numero2 == '7') {
                return 'q';
            } else if (numero2 == '8') {
                return 'r';
            } else if (numero2 == '9') {
                return 's';
            }
        } else if (numero1 == '3') { // dias 30~31
            if(numero2== '0'){
                return 't';
            } else if (numero2 == '1') {
                return 'u';
            }
        }

        return '?';
    }
    public char mesParasimbolo (char numero1, char numero2){
        if (numero1 == '0'){// mes 01~09
            if (numero2 == '1'){
                return '1';
            } else if (numero2 == '2') {
                return '2';
            } else if (numero2 == '3') {
                return '3';
            } else if (numero2 == '4'){
                return '4';
            } else if (numero2 == '5' ) {
                return '5';
            } else if (numero2 == '6') {
                return '6';
            } else if (numero2 == '7') {
                return '7';
            } else if (numero2 == '8') {
                return '8';
            } else if (numero2 == '9') {
                return '9';
            }
        } else if (numero1 == '1') { // mes 10~12
            if(numero2== '0'){
                return '0';
            } else if (numero2 == '1'){
                return 'a';
            } else if (numero2 == '2') {
                return 'b';
            }
        }
        return '?';
    }
    public char seculoDoAno (char numero1, char numero2){
        if (numero1 == '0') {// ano ex 0000 ~0190
            if (numero2 == '1'){
                return '1';
            } else if (numero2 == '2') {
                return '2';
            } else if (numero2 == '3') {
                return '3';
            } else if (numero2 == '4'){
                return '4';
            } else if (numero2 == '5' ) {
                return '5';
            } else if (numero2 == '6') {
                return '6';
            } else if (numero2 == '7') {
                return '7';
            } else if (numero2 == '8') {
                return '8';
            } else if (numero2 == '9') {
                return '9';
            }
        } else if (numero1 == '1') { // dias 10~19
            if(numero2== '0'){
                return '0';
            } else if (numero2 == '1'){
                return 'a';
            } else if (numero2 == '2') {
                return 'b';
            } else if (numero2 == '3') {
                return 'c';
            } else if (numero2 == '4'){
                return 'd';
            } else if (numero2 == '5' ) {
                return 'e';
            } else if (numero2 == '6') {
                return 'f';
            } else if (numero2 == '7') {
                return 'g';
            } else if (numero2 == '8') {
                return 'h';
            } else if (numero2 == '9') {
                return 'i';
            }
        } else if (numero1 == '2') { // dias 20~29
            if(numero2== '0'){
                return 'j';
            } else if (numero2 == '1'){
                return 'k';
            } else if (numero2 == '2') {
                return 'l';
            } else if (numero2 == '3') {
                return 'm';
            } else if (numero2 == '4'){
                return 'n';
            } else if (numero2 == '5' ) {
                return 'o';
            } else if (numero2 == '6') {
                return 'p';
            } else if (numero2 == '7') {
                return 'q';
            } else if (numero2 == '8') {
                return 'r';
            } else if (numero2 == '9') {
                return 's';
            }
        } else if (numero1 == '3') {
            if(numero2== '0'){
                return 't';
            } else if (numero2 == '1') {
                return 'u';
            } else if (numero2 == '2') {
                return 'v';
            } else if (numero2 == '3') {
                return 'w';
            } else if (numero2 == '4') {
                return 'x';
            } else if (numero2 == '5'){
                return 'y';
            } else if (numero2 == '6'){
                return 'z';
            }
        }
        return '?';
    }
}
