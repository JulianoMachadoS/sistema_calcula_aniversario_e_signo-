import java.text.Normalizer;
import java.util.Date;
import java.util.Scanner;
public class Construtor {
    public String formataNome(String texto){
        Removedores r = new Removedores();
        texto = r.removeEspacosInicioFim(texto);
        texto = r.removeEspacos(texto);
        texto = r.removeNumeros(texto);
        texto = r.removeSimbulos(texto);
        return texto;
    }
    public String formataDataDeAniversario(){
        Scanner teclado = new Scanner(System.in);
        Removedores r = new Removedores();
        Contadores cn = new Contadores();
        String dataDenascimento = "";
        int contador = 0;
        int contador2 = 0;
        while (contador != 8 ){
            if (contador2 == 0){
                System.out.print("Que dia você nasceu?\nDe a data neste formato [ dia/mes/ano ] " +
                        "com zeros inclusos ");
                contador2++;
            }else{
                System.out.println("Sua data precisa estar neste formato [ dia/mes/ano ] com zeros inclusos. \nEx: 02/03/2002 \n");
                System.out.print("Digite novamente sua data de nascimento: ");
            }
            dataDenascimento = teclado.nextLine();
            dataDenascimento = r.removeEspacos(dataDenascimento);
            dataDenascimento = r.removeSimbulos(dataDenascimento);
            dataDenascimento = r.removeLetras(dataDenascimento);
            contador = cn.contaNumeros(dataDenascimento);
        }
        System.out.println("Sua data de nascimento é " + dataDenascimento.substring(0,2)+
                "/"+dataDenascimento.substring(2,4)+ "/" +dataDenascimento.substring(4,dataDenascimento.length()));
        // colocar sop com data no formato -> xx/zz/wwww
        return dataDenascimento;
    }
    public int diaAniversario (String dataDenascimento){
        int dia = Integer.parseInt(dataDenascimento.substring(0,2));
        return dia;
    }
    public int mesAniversario (String dataDenascimento){
        int mes = Integer.parseInt(dataDenascimento.substring(2,4));
        return mes;

    }
    public int anoAniversario (String dataDenascimento){
        int ano = Integer.parseInt(dataDenascimento.substring(4,dataDenascimento.length()));
        return ano;
    }
    public String diaDaSemanaDenascimento(int dia, int mes, int ano){
        Scanner teclado = new Scanner(System.in);
        if (mes <= 2) {
            mes += 12;
            ano -= 1;
        }
        int j = ano/100; // J é o século ano/100
        int k =  (ano % 100);//K é o ano do século (ano\mod 100)
        int div1 = ((mes +1)*26)/10;
        int div2 = k /4;
        int div3 = j /4;
        int diaDaSemana = (( dia + k + (5*j) + div1 + div2 + div3) % 7 );// modulo 7
       if (diaDaSemana == 0){
           return "Sábado";
       } else if (diaDaSemana == 1) {
           return "Domingo";
       }else if (diaDaSemana == 2) {
           return "Segunda-feira";
       }else if (diaDaSemana == 3) {
           return "Terça-feira";
       }else if (diaDaSemana == 4) {
           return "Quarta-feira";
       }else if (diaDaSemana == 5){
           return "Quinta-feira";
       }
       return "Sexta-feira";
    }
    public String signodoUsuario (int dia, int mes){
        //Aquário: 21 de janeiro a 19 de fevereiro
        if (  (mes == 1 && dia >=21) || (mes == 2 && dia <=19 )  ) {
            return "Aquário";
           //Peixes: 20 de fevereiro a 20 de março
        } else if (mes == 2 || (mes == 3 && dia <= 20)) {
            return "Peixes";
            //Áries: 21 de março a 20 de abril
        }else if (mes == 3 || (mes == 4 && dia <= 20)){
            return "Áries";
            //Touro: 21 de abril a 20 de maio
        }else if (mes == 4 || (mes == 5 && dia <= 20)){
            return "Touro";
            //Gêmeos: 21 de maio a 20 de junho
        }else if (mes == 5 || (mes == 6 &&  dia <= 20)){
            return "Gêmeos";
            //Câncer: 21 de junho a 22 de julho
        }else if (mes == 6 || (mes == 7 &&  dia <= 22)){
            return "Câncer";
            //Leão: 23 de julho a 22 de agosto
        }else if (mes == 7 || (mes == 8 && dia <= 22)){
            return "Leão";
            //Virgem: 23 de agosto a 22 de setembro
        }else if (mes == 8 || (mes == 9 &&  dia <= 22)){
            return "Virgem";
            //Libra: 23 de setembro a 22 de outubro
        }else if (mes == 9 || (mes == 10 && dia <= 20)){
            return "Libra";
            //Escorpião: 23 de outubro a 21 de novembro
        }else if (mes == 10 || (mes == 11 && dia <= 20)){
            return "Escorpião";
            //Sagitário: 22 de novembro a 21 de dezembro
        }else if (mes == 11 || (mes == 12 && dia <= 21)){
            return "Sagitário";
            //Capricórnio: 22 de dezembro a 20 de janeiro
        }
        return "Capricórnio";
    }
    public boolean comparaAnagrama(String primeiroNome, String segundoNome) {
        Removedores r = new Removedores();
        String normalizadoP = r.removeEspacos(Normalizer.normalize(primeiroNome, Normalizer.Form.NFD));
        String normalizadoS = r.removeEspacos(Normalizer.normalize(segundoNome, Normalizer.Form.NFD));

        if(normalizadoP.length() != normalizadoS.length()) {
            return false;
        }

        String stringOrdenadaP = ordenaString(normalizadoP.toLowerCase());
        String stringOrdenadaS = ordenaString(normalizadoS.toLowerCase());

        return stringOrdenadaP.equals(stringOrdenadaS);
    }

    public String ordenaString (String valor) {
        StringBuilder stringOrdenada = new StringBuilder();
        String copia = valor;
        while (!copia.isEmpty()) {
            String menor = copia.substring(0, 1);
            int indexMenor = 0;

            for (int i = 1; i < copia.length(); i++) {
                String teste = copia.substring(i, i+1);
                if(menor.compareTo(teste) > 0) {
                    menor = teste;
                    indexMenor = i;
                }
            }

            stringOrdenada.append(menor);
            copia = copia.substring(0, indexMenor) + copia.substring(indexMenor + 1);
        }
        return stringOrdenada.toString();
    }

    public int diasFaltantesAniversario(int dia, int mes) {
        Date atual = new Date();

        Date aniversarioDate = new Date(atual.getYear(), mes-1, dia+1);

        if (aniversarioDate.before(atual)) {
            aniversarioDate = new Date(atual.getYear() + 1, mes-1, dia+1);
        }

        long tempo = (aniversarioDate.getTime() - atual.getTime()) / 86400000;

        return (int) tempo;

    }
    public String nomeUsuario(){
        Removedores r = new Removedores();
        Scanner teclado  = new Scanner (System.in);

        System.out.print("Digite seu nome ");
        String nome = teclado.nextLine();
        nome = nome.toLowerCase();
        nome = r.removeSimbulos(nome);
        nome = r.removeEspacosDuplos(nome);
        nome = r.removeNumeros(nome);
        nome = r.removeEspacosInicioFim(nome);
        nome = primeiraLetraMaiuscula(nome);
        nome = maiusculaDepoisDoespaco(nome);
        return nome;
    }
    public String primeiraLetraMaiuscula(String texto){
        texto = texto.substring(0,1).toUpperCase() + texto.substring(1);
        return texto;
    }
    public String maiusculaDepoisDoespaco (String texto){
        Verificadores vr = new Verificadores();
        for (int i = 0; i < texto.length() - 1; i++){
            if (texto.charAt(i) == ' ' && vr.ehLetradoAlfabetoAZ(texto.charAt(i+1)) ){
                //se for " "  E letra do alfabeto a sucessão (i+1) entra no if
                texto = texto.substring(0,i+1) + Character.toUpperCase(texto.charAt(i+1)) + texto.substring(i+2, texto.length());
            }
        }
        return texto;
    }
}
